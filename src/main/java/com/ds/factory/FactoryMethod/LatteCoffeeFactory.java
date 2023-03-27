package com.ds.factory.FactoryMethod;

/**
 * 拿铁咖啡工厂实现类
 */
public class LatteCoffeeFactory implements  CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
