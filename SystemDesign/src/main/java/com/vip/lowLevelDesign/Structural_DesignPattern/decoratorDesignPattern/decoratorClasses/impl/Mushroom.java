package com.vip.lowLevelDesign.Structural_DesignPattern.decoratorDesignPattern.decoratorClasses.impl;

import com.vip.lowLevelDesign.Structural_DesignPattern.decoratorDesignPattern.NormalPizza.BasePizza;
import com.vip.lowLevelDesign.Structural_DesignPattern.decoratorDesignPattern.decoratorClasses.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}
