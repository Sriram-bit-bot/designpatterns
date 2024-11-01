package com.learning.lld.designpatterns.singleton;

public class SingletonDesingImplMulti implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+SingletonMulti.getInstance().hashCode());
    }
}
