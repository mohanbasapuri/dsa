package org.designpatterns.factory;

public class FactoryMain {

    public static void main(String[] args) {
        String developer = "WEB";
        DeveloperFactory decider = new DeveloperFactory();
        Developer factory = decider.decide(developer);
        factory.bugFix();
    }
}
