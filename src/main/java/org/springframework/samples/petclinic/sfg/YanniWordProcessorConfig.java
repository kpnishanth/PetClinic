package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("yanniConfig")
public class YanniWordProcessorConfig {
    @Bean
    YanniWordProcessor getYanniWordProcessor() {
        return new YanniWordProcessor();
    }
}
