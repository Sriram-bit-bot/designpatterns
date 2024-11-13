package com.learning.lld.designpatterns.structural.decorator.decorator;

import com.learning.lld.designpatterns.structural.decorator.pizza.BasePizza;

public class MushroomDecorator extends PizzaToppingDecorator{
    BasePizza basePizza;

    public MushroomDecorator(BasePizza basePizza){
        this.basePizza =basePizza;
    }

    public int cost(){

        return basePizza.cost()+25;
    }
}
