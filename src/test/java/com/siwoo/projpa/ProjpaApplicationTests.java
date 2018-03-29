package com.siwoo.projpa;

import com.siwoo.projpa.util.ApplicationEnvironment;
import com.siwoo.projpa.util.MakeSuore;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjpaApplicationTests {

	@Autowired
	ApplicationContext c;

	@Test
	public void contextLoads() {
		ConfigurableEnvironment environment = (ConfigurableEnvironment) c.getEnvironment();
		log.warn(Arrays.toString( environment.getActiveProfiles() ));
		ApplicationEnvironment env = c.getBean(ApplicationEnvironment.class);
		log.info(env.toString());

		MakeSuore makeSuore = c.getBean(MakeSuore.class);
		log.warn(makeSuore.toString());
		environment.setActiveProfiles("prod");
		makeSuore = c.getBean(MakeSuore.class);
		log.warn(makeSuore.toString());
	}

}
