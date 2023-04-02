package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {HearingInterpreterComponentScanTest.config.class})
class HearingInterpreterComponentScanTest {
    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.sfg")
    static class config {

    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeared() {
        String whatIHeared = hearingInterpreter.whatIHeared();
        assertEquals("Yanni",whatIHeared);
    }
}