package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.samples.petclinic.sfg.WordProcessor;

@Configuration
public class BaseConfig {
    @Bean
    HearingInterpreter getHearingInterpreter(WordProcessor wordProcessor) {
        return new HearingInterpreter(wordProcessor);
    }
}
