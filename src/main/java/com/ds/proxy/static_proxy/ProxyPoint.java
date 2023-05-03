package com.ds.proxy.static_proxy;

/**
 * 代理类
 */
public class ProxyPoint implements SellTickets{
    private  TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代理");
        trainStation.sell();

    }
}
