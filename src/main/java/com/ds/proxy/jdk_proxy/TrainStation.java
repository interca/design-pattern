package com.ds.proxy.jdk_proxy;


public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖火车票");

    }

    @Override
    public void sell2() {
        System.out.println("打折");

    }
}
