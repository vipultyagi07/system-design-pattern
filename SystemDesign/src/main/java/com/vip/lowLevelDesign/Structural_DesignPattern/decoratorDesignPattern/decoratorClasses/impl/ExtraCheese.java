package com.vip.lowLevelDesign.Structural_DesignPattern.decoratorDesignPattern.decoratorClasses.impl;

import com.vip.lowLevelDesign.Structural_DesignPattern.decoratorDesignPattern.NormalPizza.BasePizza;
import com.vip.lowLevelDesign.Structural_DesignPattern.decoratorDesignPattern.decoratorClasses.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
