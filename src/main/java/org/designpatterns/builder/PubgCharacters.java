package org.designpatterns.builder;

public class PubgCharacters {
    //Required
    private final String userName;
    private final String cast;

    //optional
    private final String weapon;
    private final String vehicle;

    public PubgCharacters(PubgCharacterBuilder builder) {
        this.userName = builder.USER;
        this.cast = builder.CAST;
        this.weapon = builder.WEAPON;
        this.vehicle = builder.VEHICLE;
    }

    public void display() {
        System.out.println("USER:" + userName);
        System.out.println("CAST:" + cast);
        System.out.println("WEAPON:" + weapon);
        System.out.println("VEHICLE:" + vehicle);
    }


    static class PubgCharacterBuilder {
        private final String USER;
        private final String CAST;
        private String WEAPON;
        private String VEHICLE;

        public PubgCharacterBuilder(String USER, String CAST) {
            this.USER = USER;
            this.CAST = CAST;
        }

        public PubgCharacterBuilder setWEAPON(String WEAPON) {
            this.WEAPON = WEAPON;
            return this;
        }

        public PubgCharacterBuilder setVEHICLE(String VEHICLE) {
            this.VEHICLE = VEHICLE;
            return this;
        }

        public PubgCharacters build() {
            return new PubgCharacters(this);
        }
    }
}
