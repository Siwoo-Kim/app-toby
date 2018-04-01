package com.siwoo.projpa;

import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.ProjectRepository;
import com.siwoo.projpa.repository.SectionRepository;
import com.siwoo.projpa.repository.UserRepository;
import com.siwoo.projpa.util.ApplicationEnvironment;
import com.siwoo.projpa.util.MakeSuore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

@Slf4j
@SpringBootApplication
public class ProjpaApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ProjpaApplication.class, args);
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

	@Bean
	CommandLineRunner fixture() {
		return args -> {
			projectRepository.saveAll(FixtureFactory.projects());
		};
	}


}
