package com.learning.lld.designpatterns.singleton;

public final class Singleton {
    private static Singleton singletonInstance =null;

    private Singleton(){
    }
    public static Singleton getInstance(){
        if(singletonInstance == null){
            singletonInstance =new Singleton();
        }
        return singletonInstance;
    }
    public void performOperation(){
        System.out.println("Performing Operation");
    }
}
