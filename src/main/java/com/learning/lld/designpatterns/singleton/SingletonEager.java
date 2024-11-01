package com.learning.lld.designpatterns.singleton;

public final class SingletonEager {
    private static final SingletonEager singletonInstance =new SingletonEager();

    private SingletonEager(){
    }
    public static SingletonEager getInstance(){
        return singletonInstance;
    }
    public void performOperation(){
        System.out.println("Performing Operation");
    }
}
