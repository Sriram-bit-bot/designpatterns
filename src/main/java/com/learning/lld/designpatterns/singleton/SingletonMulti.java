package com.learning.lld.designpatterns.singleton;

public final class SingletonMulti {
    private static SingletonMulti singletonInstance =null;

    private SingletonMulti(){
    }
    public static SingletonMulti getInstance(){
        if(singletonInstance == null){
            synchronized (SingletonMulti.class){ // synchronized block instead of synchronized class
                if(singletonInstance == null){ // double check locking
                    singletonInstance =new SingletonMulti();
                }
            }
        }
        return singletonInstance;
    }
    public void performOperation(){
        System.out.println("Performing Operation");
    }
}
