package org.designpatterns.builder;

public class BuilderMain {
    public static void main(String[] args) {
        PubgCharacters pubgCharacters = new PubgCharacters.PubgCharacterBuilder("Mohan", "Emperor")
                .setWEAPON("M416")
                .setVEHICLE("Buggy")
                .build();

        pubgCharacters.display();

    }
}
