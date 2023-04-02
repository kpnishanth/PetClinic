package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfg.BaseConfig;
import org.springframework.samples.petclinic.sfg.WordProcessor;
import org.springframework.samples.petclinic.sfg.YanniWordProcessorConfig;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(classes = {BaseConfig.class, LaurelWordProcessorConfig.class})
class LaurelWordProcessorTest {
    @Autowired
    WordProcessor wordProcessor;

    @Test
    public void wordProcessortest() {
        String word = wordProcessor.getWord();
        assertEquals("Laurel",word);
    }
}