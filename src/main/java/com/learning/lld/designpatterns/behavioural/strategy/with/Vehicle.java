package com.learning.lld.designpatterns.behavioural.strategy.with;

import com.learning.lld.designpatterns.behavioural.strategy.with.strategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy =driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
