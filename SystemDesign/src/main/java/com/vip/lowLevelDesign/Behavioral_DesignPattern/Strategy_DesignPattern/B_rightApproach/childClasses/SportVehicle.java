package com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.Vehicle;
import com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses.driveStrategy.impl.SpecialDrive;

public class SportVehicle extends Vehicle {



    public SportVehicle() {

        super(new SpecialDrive());
    }


}
