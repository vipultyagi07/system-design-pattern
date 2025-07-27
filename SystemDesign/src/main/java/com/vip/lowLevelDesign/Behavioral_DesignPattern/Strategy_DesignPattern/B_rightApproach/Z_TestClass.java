package com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach;


import com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses.OffRoadVehicle;
import com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses.PassengerVehicle;
import com.vip.lowLevelDesign.Behavioral_DesignPattern.Strategy_DesignPattern.B_rightApproach.childClasses.SportVehicle;

public class Z_TestClass {

    public static void main(String[] args) {

       Vehicle passengerVehicle= new PassengerVehicle();
        passengerVehicle.drive();

       Vehicle offRoadVehicle= new OffRoadVehicle();
        offRoadVehicle.drive();

        Vehicle sportVehicle= new SportVehicle();
        sportVehicle.drive();



    }
}
