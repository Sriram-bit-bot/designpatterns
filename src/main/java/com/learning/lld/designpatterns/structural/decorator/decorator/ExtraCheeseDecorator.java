package com.learning.lld.designpatterns.structural.decorator.decorator;

import com.learning.lld.designpatterns.structural.decorator.pizza.BasePizza;

public class ExtraCheeseDecorator extends PizzaToppingDecorator{
    BasePizza basePizza;
    int cost;

    public ExtraCheeseDecorator(BasePizza basePizza){
        this.basePizza =basePizza;
    }

    public int cost(){
        return basePizza.cost()+15;
    }
}
