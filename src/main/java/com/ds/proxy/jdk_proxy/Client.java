package com.ds.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1、代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
