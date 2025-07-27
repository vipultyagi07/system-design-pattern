package com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses.driveStrategy.impl;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses.driveStrategy.DriveStrategy;

public class SpecialDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Vehicle is in special drive mode");
    }
}
