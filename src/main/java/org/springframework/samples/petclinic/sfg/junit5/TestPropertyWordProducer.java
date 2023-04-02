package org.springframework.samples.petclinic.sfg.junit5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("org.springframework.samples.petclinic.sfg")
public class TestPropertyWordProducer {


    public String getWord() {
        return word;
    }

    @Value("${word}")
    String word;

}
