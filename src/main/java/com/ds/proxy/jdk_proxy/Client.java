package com.ds.proxy.jdk_proxy;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1、代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        proxyObject.sell2();
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list.get(2));
        System.out.println(list);
    }
}
