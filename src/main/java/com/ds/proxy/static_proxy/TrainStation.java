package com.ds.proxy.static_proxy;

public class TrainStation implements  SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖火车票");

    }
}
