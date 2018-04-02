package com.siwoo.projpa;

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
		ApplicationContext c = SpringApplication.run(ProjpaApplication.class, args);

		EntityManager entityManager = c.getBean(EntityManager.class);
		Assert.notNull(entityManager);

		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		while(true) {
			System.out.print("JPQL> ");
			String query = scanner.nextLine();
			if(query.equals("Q")) {
				break;
			}
			if(!StringUtils.hasText(query)){
				continue;
			}

			try{
				List result = entityManager.createQuery(query).getResultList();

				if(noResult(result)){
					continue;
				};

				System.out.println("=====================================================");
				System.out.println(result.size() + " data retrieved");
				for(Object rows: result){
					printResult(rows);
					System.out.println();
				}
				System.out.println("=====================================================");

			}catch (Exception e){
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
			users.get(0).addProject(projects.get(0));
			users.get(0).addProject(projects.get(1));
			users.get(0).addProject(projects.get(2));
			users.get(1).addProject(projects.get(0));
			users.get(1).addProject(projects.get(3));
			users.get(2).addProject(projects.get(1));
			userRepository.saveAll(users);

			Project project = projectRepository.getByNames("JAVA").get(0);
			List<Section> sections = FixtureFactory.sections();
			for(Section section: sections) {
				section.setProject(project);
			}
			sections = FixtureFactory.sections();
			project = projectRepository.getByNames("HTML").get(0);
			for(Section section: sections) {
				section.setProject(project);
			}
			sectionRepository.saveAll(sections);
			sectionRepository.saveAll(FixtureFactory.sections()); //no matching project
			documentRepository.saveAll(FixtureFactory.documents());
		};
	}


}
