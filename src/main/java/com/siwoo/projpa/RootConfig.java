package com.siwoo.projpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.siwoo.projpa.repository")
@EnableJpaRepositories("com.siwoo.projpa.repository")
@EntityScan("com.siwoo.projpa.domain")
public class RootConfig {

}
