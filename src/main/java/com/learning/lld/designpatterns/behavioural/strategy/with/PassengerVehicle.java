package com.learning.lld.designpatterns.behavioural.strategy.with;

import com.learning.lld.designpatterns.behavioural.strategy.with.strategy.NormalDriveStrategy;
import com.learning.lld.designpatterns.behavioural.strategy.with.Vehicle;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
