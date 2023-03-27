package com.ds.factory.simpleFactory;

/**
 * 咖啡店
 */
public class CoffeeShop {
    public  Coffee order(String name){
       SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.creatCoffee(name);
        return coffee;
    }
}
