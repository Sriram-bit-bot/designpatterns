package com.learning.lld.designpatterns.singleton;
// Creational Design Pattern - 1
public class SingletonDesignImpl{
    public static void main(String[] args) {
        //Singleton s =new Singleton(); -> this is not possible as we made the constructor private
//        Singleton singletonObj1 =Singleton.getInstance();
//        Singleton singletonObj2 =Singleton.getInstance();
//
//        System.out.println("Hashcode of object 1: "+singletonObj1.hashCode());
//        System.out.println("Hashcode of object 2: "+singletonObj2.hashCode());
//
//        singletonObj1.performOperation();
//        singletonObj2.performOperation();

        // Threaded
        SingletonDesingImplMulti singletonObjMulti =new SingletonDesingImplMulti();
        for(int i=0;i<10;i++){
            Thread t1 =new Thread(singletonObjMulti);
            t1.start();
        }
    }
}