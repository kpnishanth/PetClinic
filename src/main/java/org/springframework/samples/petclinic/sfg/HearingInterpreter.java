package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Service;

@Service
public class HearingInterpreter {
    WordProcessor wordProcessor;

    public HearingInterpreter(WordProcessor wordProcessor) {
        this.wordProcessor = wordProcessor;
    }

    public String whatIHeared(){
        return wordProcessor.getWord();
    }
}
