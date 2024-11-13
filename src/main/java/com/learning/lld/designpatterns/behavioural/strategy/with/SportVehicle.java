package com.learning.lld.designpatterns.behavioural.strategy.with;

import com.learning.lld.designpatterns.behavioural.strategy.with.Vehicle;
import com.learning.lld.designpatterns.behavioural.strategy.with.strategy.SpecialDriveStrategy;

public class SportVehicle extends Vehicle {
    public SportVehicle(){
        super(new SpecialDriveStrategy());
    }
}
