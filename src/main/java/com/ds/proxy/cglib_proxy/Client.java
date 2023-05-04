package com.ds.proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxy = proxyFactory.getProxy();
        proxy.sell2();
    }
}
