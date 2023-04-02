package org.springframework.samples.petclinic.sfg.junit5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.sfg.LaurelWordProcessor;

@Configuration
@Profile("laurelConfig")
public class LaurelWordProcessorConfig {
    @Bean
    LaurelWordProcessor getLaurelWordProcessor(){
        return new LaurelWordProcessor();
    }
}
