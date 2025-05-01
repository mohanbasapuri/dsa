package org.designpatterns.singleton;

public class SingletonThreadsafe {

    private static SingletonThreadsafe singletonThreadsafe;

    private SingletonThreadsafe(){
        System.out.println("Inside constructor");
    }

    public synchronized static SingletonThreadsafe getThreadSafeInstanceSync(){
        if(singletonThreadsafe == null){
            singletonThreadsafe = new SingletonThreadsafe();
        }
        return singletonThreadsafe;
    }


    public  static SingletonThreadsafe getThreadSafeInstanceSyncBlock(){
        if(singletonThreadsafe == null){
            synchronized (SingletonThreadsafe.class){
                if(singletonThreadsafe == null){
                    singletonThreadsafe = new SingletonThreadsafe();
                }
            }
        }
        return singletonThreadsafe;
    }
}
