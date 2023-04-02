package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("yanny")
public class YanniWordProducer implements WordProcessor {
    @Override
    public String getWord() {
        return "Yanni";
    }
}
