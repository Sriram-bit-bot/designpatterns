package com.learning.lld.designpatterns.behavioural.strategy.with.strategy;

public class NormalDriveStrategy implements  DriveStrategy{
    public void drive(){
        System.out.println("Normal drive");
    }
}
