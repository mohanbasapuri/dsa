package org.designpatterns.singleton;

public class SingletonEager {
    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager(){
        System.out.println("inside constructor");
    }

    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
