package com.ds.factory.FactoryMethod;

public class client {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.setCoffeeFactory(new AmericanCoffeeFactory());
        Coffee order = coffeeShop.order();
        System.out.println(order.getName());
    }
}
