package com.ds.factory.configFactory;

/**
 * 咖啡类
 */
public abstract class Coffee {
    public  abstract String  getName();

   public  void addMilk(){
       System.out.println("加牛奶");
   }

   public  void addSugar(){
       System.out.println("加糖");
   }
}
