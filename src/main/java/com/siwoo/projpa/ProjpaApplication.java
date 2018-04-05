package com.siwoo.projpa;

import com.siwoo.projpa.domain.*;
import com.siwoo.projpa.repository.*;
import com.siwoo.projpa.util.ApplicationEnvironment;
import com.siwoo.projpa.util.MakeSuore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j

@PropertySource("classpath:application.properties")
@SpringBootApplication(scanBasePackages = "com.siwoo.projpa")
public class ProjpaApplication {

    @Autowired
    WebPageRepository webPageRepository;
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    SectionRepository sectionRepository;
    @Autowired
    DocumentRepository documentRepository;

    public static void main(String[] args) throws InterruptedException {
        /*	ApplicationContext context = */
        SpringApplication.run(ProjpaApplication.class, args);

//		EntityManager entityManager = context.getBean(EntityManager.class);
//		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//
//		while (true) {
//
//			System.out.printf("JPQL> ");
//			String query = scanner.nextLine();
//
//			if(query.equals("Q")){
//				System.exit(0);
//			}
//			if(!StringUtils.hasText(query)){
//				continue;
//			}
//
//			try {
//				List result = entityManager.createQuery(query).getResultList();
//
//				if(noResult(result)) {
//                    System.out.println("No Result : try again");
//                }
//
//
//				for(Object row: result) {
//                    int count = 1;
//                    System.out.println("=========================================================");
//                    System.out.println("Data Retrieved: ");
//                    System.out.printf(" Data : " + count + " [");
//                    printResult(row);
//                    System.out.printf(" ] ");
//                    count++;
//                }
//				System.out.println("===============================================================");
//			} catch (Exception e) {
//				e.printStackTrace();
//
//			}
//		}
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

    @Transactional
    @Bean
    CommandLineRunner fixture() {
        return args -> {
            User siwoo = new User();
            siwoo.setName(new Name("Siwoo", "Kim", null));
            siwoo.setEmail("sm123tt@gmail.com");
            siwoo.setLevel(User.Level.GOLD);
            userRepository.save(siwoo);
            List<WebPage> webPages = FixtureFactory.webPages();
            for(WebPage webPage: webPages) {
                webPage.setAuthor(siwoo);
            }
            webPageRepository.saveAll(webPages);
            List<Project> projects = FixtureFactory.projects();
            projectRepository.saveAll(projects);
            List<User> users = FixtureFactory.users();
            userRepository.saveAll(users);

            Project project = projects.get(0);
            for (User user : FixtureFactory.users()) {
                user.setEmail(user.getEmail().replace("com", "net"));
                user.addProject(project);
                userRepository.save(user);
            }

            project = projectRepository.getByNames("JAVA").get(0);
            List<Section> sections = FixtureFactory.sections();
            for (Section section : sections) {
                section.setProject(project);
                sectionRepository.save(section);
            }

            project = projectRepository.getByNames("JAVASCRIPT").get(0);
            sections = FixtureFactory.sections();
            for (Section section : sections) {
                section.setProject(project);
                sectionRepository.save(section);
            }

            sectionRepository.saveAll(sections);
            sectionRepository.saveAll(FixtureFactory.sections()); //no matching project
            documentRepository.saveAll(FixtureFactory.documents());
            Section section = sections.get(0);
            for (Document document : FixtureFactory.documents()) {
                document.setSection(section);
                documentRepository.save(document);
            }
            section = sections.get(1);
            for (Document document : FixtureFactory.documents()) {
                document.setSection(section);
                documentRepository.save(document);
            }
        };
    }


}
