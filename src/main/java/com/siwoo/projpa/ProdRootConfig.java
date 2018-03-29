package com.siwoo.projpa;

import com.siwoo.projpa.util.MakeSuore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class ProdRootConfig {

    @Bean
    MakeSuore makeSuore(){
        return new MakeSuore("prod");
    }

}
