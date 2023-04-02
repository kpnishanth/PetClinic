package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class YanniWordProducer implements WordProcessor {
    @Override
    public String getWord() {
        return "Yanni";
    }
}
