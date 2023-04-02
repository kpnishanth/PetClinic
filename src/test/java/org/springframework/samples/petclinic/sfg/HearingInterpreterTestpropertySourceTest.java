package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfg.junit5.TestPropertyWordProducer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitConfig(classes = TestPropertyWordProducer.class)
@ActiveProfiles("laurel")
@TestPropertySource("classpath:yanny.properties")
class HearingInterpreterTestpropertySourceTest {
@Autowired
HearingInterpreter hearingInterpreter;
@Autowired
TestPropertyWordProducer testProperties;
    @Test
    void whatIHeared() {
        String whatIHeared = hearingInterpreter.whatIHeared();
        assertEquals(testProperties.getWord(),whatIHeared);
    }
}