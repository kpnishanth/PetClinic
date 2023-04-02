package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Component;

@Component
public class LaurelWordProcessor implements WordProcessor {
    @Override
    public String getWord() {
        return "Laurel";
    }
}
