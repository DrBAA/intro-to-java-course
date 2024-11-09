package com.cbfacademy;


public class CharacterCopier {
    private final Source source;
    private final Destination destination;

    public CharacterCopier(Source source, Destination destination) {
        this.source = source;
        this.destination = destination;
    }

    public void copy() {
        char c;
        while ((c = source.read()) != '\n') {
            destination.write(c);
        }
    }
}
