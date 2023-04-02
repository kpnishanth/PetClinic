package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {HearingInterpreterActiveProfileTest.config.class})
@ActiveProfiles("laura")
class HearingInterpreterActiveProfileTest {
    @Autowired
    HearingInterpreter hearingInterpreter;
    @ComponentScan("org.springframework.samples.petclinic.sfg")
    static class config{

    }

    @Test
    void whatIHeared() {
        String whatIHeared = hearingInterpreter.whatIHeared();
        assertEquals("Laurel",whatIHeared);
    }
}