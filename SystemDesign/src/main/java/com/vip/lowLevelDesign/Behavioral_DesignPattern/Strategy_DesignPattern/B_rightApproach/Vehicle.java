package com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses.driveStrategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){

        this.driveStrategy=driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
    public Vehicle() {

    }

}
