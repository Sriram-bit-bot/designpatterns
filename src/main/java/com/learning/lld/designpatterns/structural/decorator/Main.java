package com.learning.lld.designpatterns.structural.decorator;

import com.learning.lld.designpatterns.structural.decorator.decorator.ExtraCheeseDecorator;
import com.learning.lld.designpatterns.structural.decorator.decorator.MushroomDecorator;
import com.learning.lld.designpatterns.structural.decorator.pizza.BasePizza;
import com.learning.lld.designpatterns.structural.decorator.pizza.MargheritaPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza mg =new MargheritaPizza();

        BasePizza addCheese =new ExtraCheeseDecorator(mg);
        BasePizza mushroom =new MushroomDecorator(addCheese);

        System.out.println("cost "+mushroom.cost() );

    }
}
