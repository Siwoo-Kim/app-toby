package com.siwoo.projpa;

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

@Slf4j
@SpringBootApplication
public class ProjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjpaApplication.class, args);
	}

	@Bean
	CommandLineRunner profiler(@Autowired ApplicationEnvironment env, @Autowired MakeSuore makeSuore) {
		return args -> {
			log.info(env.toString());
			log.info(makeSuore.toString());
		};
	}
}
