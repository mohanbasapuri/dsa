package org.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMainClass {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Singleton with eager initialization
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println(singletonEager1.hashCode());

        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager2.hashCode());

        // Singleton with lazy initialization
        SingletonLazy singletonLazy1 = SingletonLazy.getLazyInstance();
        System.out.println(singletonLazy1.hashCode());

        SingletonLazy singletonLazy2 = SingletonLazy.getLazyInstance();
        System.out.println(singletonLazy2.hashCode());

        // Singleton with threadsafe lazy initialization
        Thread t1 = new Thread(() -> {
            SingletonThreadsafe singletonLazy = SingletonThreadsafe.getThreadSafeInstanceSync();
            System.out.println(singletonLazy.hashCode());
        });

        Thread t2 = new Thread(() -> {
            SingletonThreadsafe singletonLazy = SingletonThreadsafe.getThreadSafeInstanceSync();
            System.out.println(singletonLazy.hashCode());
        });

        t1.start();
        t2.start();

        // Singleton with threadsafe lazy initialization block
         Thread tl1 = new Thread(() -> {
            SingletonThreadsafe singletonLazy = SingletonThreadsafe.getThreadSafeInstanceSyncBlock();
            System.out.println(singletonLazy.hashCode());
        });

        Thread tl2 = new Thread(() -> {
            SingletonThreadsafe singletonLazy = SingletonThreadsafe.getThreadSafeInstanceSyncBlock();
            System.out.println(singletonLazy.hashCode());
        });

        tl1.start();
        tl2.start();


        //Using enums
     SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum1.hashCode());

        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum2.hashCode());

    // ----> Breaking singleton using clone <----
        SingletonLazy breakSingleton1 = SingletonLazy.getLazyInstance();
        System.out.println(breakSingleton1.hashCode());

        SingletonLazy breakSingleton2 = (SingletonLazy) breakSingleton1.clone();
        System.out.println(breakSingleton2.hashCode());

        // ----> Breaking singleton using reflections <----
       Constructor<SingletonLazy> constructor = SingletonLazy.class.getDeclaredConstructor();
       constructor.setAccessible(true);
       SingletonLazy singletonLazy = constructor.newInstance();
       System.out.println(singletonLazy.hashCode());

    }


}
