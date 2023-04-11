package com.ds.builder.demo1;

/**
 * ofo构建者
 */
public class OfoBuilder extends  Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("ofo车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
