package com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.Vehicle;
import com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses.driveStrategy.impl.NormalDrive;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {

    super(new NormalDrive());
    }



}
