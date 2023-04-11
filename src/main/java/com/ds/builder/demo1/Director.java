package com.ds.builder.demo1;

/**
 * 指挥者
 */
public class Director {

    private  Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    //组装自行车
    public  Bike construct(){
        builder.buildSeat();
        builder.buildFrame();
        Bike bike = builder.createBike();
        return bike;
    }
}
