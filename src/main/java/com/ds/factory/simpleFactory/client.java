package com.ds.factory.simpleFactory;

public class client {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee amercian = coffeeShop.order("american");
        System.out.println(amercian.getName());
    }
}
