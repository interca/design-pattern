package com.ds.factory.FactoryMethod;

/**
 * 美式咖啡工厂实现类
 */
public class AmericanCoffeeFactory implements  CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericaCoffee();
    }
}
