package org.designpatterns.singleton;

public class SingletonLazy implements Cloneable{

    private static SingletonLazy singletonLazy;
    private SingletonLazy(){
        System.out.println("inside constructor");
        if(singletonLazy != null)
            throw new RuntimeException("Object exists");
    }

    public static SingletonLazy getLazyInstance(){
        if(singletonLazy == null){
            singletonLazy=  new SingletonLazy();
        }
        return singletonLazy;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
