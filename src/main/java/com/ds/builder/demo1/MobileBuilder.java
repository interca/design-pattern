package com.ds.builder.demo1;


/**
 * 具体构建者
 */
public class MobileBuilder extends  Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("摩拜车架");
    }

    @Override
    public void buildSeat() {
     bike.setSeat("摩拜车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
