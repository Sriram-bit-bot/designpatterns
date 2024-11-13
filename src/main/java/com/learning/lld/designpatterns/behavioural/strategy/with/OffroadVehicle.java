package com.learning.lld.designpatterns.behavioural.strategy.with;

import com.learning.lld.designpatterns.behavioural.strategy.with.strategy.SpecialDriveStrategy;
import com.learning.lld.designpatterns.behavioural.strategy.with.Vehicle;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
