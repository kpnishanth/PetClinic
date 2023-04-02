package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitConfig(classes = {HearingInterpreterTest.config.class})
class HearingInterpreterTest {
    static class config{
        HearingInterpreter hearingInterpreter;
        @Bean
        public HearingInterpreter getHearingInterpreter(){
            return new HearingInterpreter(new LaurelWordProcessor());
        }
    }
@Autowired
    HearingInterpreter hearingInterpreter;
    @Test
    void whatIHeared() {
        String s = hearingInterpreter.whatIHeared();
        assertEquals("Laurel",s);
    }
}