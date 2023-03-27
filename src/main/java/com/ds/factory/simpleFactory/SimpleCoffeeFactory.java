package com.ds.factory.simpleFactory;

/**
 * 简单咖啡工厂
 */
public class SimpleCoffeeFactory {

    public Coffee creatCoffee(String name){
         Coffee coffee = null;
         if(name.equals("american")){
             coffee = new AmericaCoffee();
         }else if(name.equals("latter")){
             coffee = new LatteCoffee();
         }else throw new RuntimeException("没有这个咖啡");
         return coffee;
    }
}
