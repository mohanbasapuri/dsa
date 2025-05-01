package org.designpatterns.factory;

public class DeveloperFactory {

    public Developer decide(String developer){
        if(developer.equals("ANDROID"))
            return new AndroidDeveloper();
        else
            return new WebDeveloper();
    }
}
