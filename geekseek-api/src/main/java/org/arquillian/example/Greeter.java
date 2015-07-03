package org.arquillian.example;

import java.io.PrintStream;
import javax.ejb.LocalBean;

import javax.inject.Inject;

public class Greeter {

	
    PhraseBuilder phraseBuilder;

    @Inject
    public Greeter(PhraseBuilder phraseBuilder) {
            this.phraseBuilder = phraseBuilder;
    }

    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return phraseBuilder.buildPhrase("hello", name);
    }

}
