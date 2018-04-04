package com.siwoo.projpa;

import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.Section;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.DocumentRepository;
import com.siwoo.projpa.repository.ProjectRepository;
import com.siwoo.projpa.repository.SectionRepository;
import com.siwoo.projpa.repository.UserRepository;
import com.siwoo.projpa.util.ApplicationEnvironment;
import com.siwoo.projpa.util.MakeSuore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import static com.siwoo.projpa.support.QueryTester.*;
@Slf4j

@PropertySource("classpath:application.properties")
@SpringBootApplication(scanBasePackages = "com.siwoo.projpa" )
public class ProjpaApplication {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = SpringApplication.run(ProjpaApplication.class, args);

		EntityManager entityManager = context.getBean(EntityManager.class);
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		while (true) {

			System.out.printf("JPQL> ");
			String query = scanner.nextLine();

			if(query.equals("Q")){
				System.exit(0);
			}
			if(!StringUtils.hasText(query)){
				continue;
			}

			try {
				List result = entityManager.createQuery(query).getResultList();

				if(noResult(result)) {
                    System.out.println("No Result : try again");
                }


				for(Object row: result) {
                    int count = 1;
                    System.out.println("=========================================================");
                    System.out.println("Data Retrieved: ");
                    System.out.printf(" Data : " + count + " [");
                    printResult(row);
                    System.out.printf(" ] ");
                    count++;
                }
				System.out.println("===============================================================");
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}


	@Bean
	CommandLineRunner profiler(@Autowired ApplicationEnvironment env, @Autowired MakeSuore makeSuore) {
		return args -> {
			System.out.println(env.toString());
			System.out.println(makeSuore.toString());
			log.info(env.toString());
			log.info(makeSuore.toString());
		};
	}


	@Autowired ProjectRepository projectRepository;
	@Autowired UserRepository userRepository;
	@Autowired SectionRepository sectionRepository;
	@Autowired DocumentRepository documentRepository;

	@Transactional
	@Bean
	CommandLineRunner fixture() {
		return args -> {
			List<Project> projects = FixtureFactory.projects();
			projectRepository.saveAll(projects);
			List<User> users = FixtureFactory.users();
			userRepository.saveAll(users);

			Project project = projects.get(0);
			for(User user : FixtureFactory.users()) {
			    user.setEmail(user.getEmail().replace("com","net"));
			    user.addProject(project);
			    userRepository.save(user);
            }

			project = projectRepository.getByNames("JAVA").get(0);
			List<Section> sections = FixtureFactory.sections();
			for(Section section: sections) {
				section.setProject(project);
				sectionRepository.save(section);
			}

			project = projectRepository.getByNames("JAVASCRIPT").get(0);
			sections = FixtureFactory.sections();
			for(Section section: sections) {
				section.setProject(project);
				sectionRepository.save(section);
			}

			sectionRepository.saveAll(sections);
			sectionRepository.saveAll(FixtureFactory.sections()); //no matching project
			documentRepository.saveAll(FixtureFactory.documents());
			Section section = sections.get(0);
			for(Document document : FixtureFactory.documents()) {
			    document.setSection(section);
			    documentRepository.save(document);
            }
            section = sections.get(1);
            for(Document document : FixtureFactory.documents()) {
                document.setSection(section);
                documentRepository.save(document);
            }
		};
	}


}
