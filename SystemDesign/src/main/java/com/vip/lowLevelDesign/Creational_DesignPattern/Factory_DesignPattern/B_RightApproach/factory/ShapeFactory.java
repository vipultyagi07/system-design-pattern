package com.vip.lowLevelDesign.Creational_DesignPattern.Factory_DesignPattern.B_RightApproach.factory;

import com.vip.lowLevelDesign.Creational_DesignPattern.Factory_DesignPattern.B_RightApproach.shape.Circle;
import com.vip.lowLevelDesign.Creational_DesignPattern.Factory_DesignPattern.B_RightApproach.shape.Rectangle;
import com.vip.lowLevelDesign.Creational_DesignPattern.Factory_DesignPattern.B_RightApproach.shape.Shape;

public class ShapeFactory {

    public Shape getObject(String input){

        switch (input){
            case "rectangle":
                return new Rectangle();

            case "Circle":
                return new Circle();

            default:
                return null;

        }
    }
}
