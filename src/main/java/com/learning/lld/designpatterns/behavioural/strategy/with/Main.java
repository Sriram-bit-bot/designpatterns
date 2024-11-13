package com.learning.lld.designpatterns.behavioural.strategy.with;

public class Main {
    public static void main(String[] args) {
        OffroadVehicle offRoadVehicle =new OffroadVehicle();
        PassengerVehicle passengerVehicle =new PassengerVehicle();
        SportVehicle sportVehicle =new SportVehicle();

        offRoadVehicle.drive();
        passengerVehicle.drive();
        sportVehicle.drive();
    }
}
