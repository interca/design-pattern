package com.ds.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * jdk动态代理
 */
public class ProxyFactory {

    //声明目标对象
    private  TrainStation trainStation =new TrainStation();

    public SellTickets getProxyObject(){
       //返回代理对象
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点");
                        //执行目标对象
                        Object obj = method.invoke(trainStation, args);
                        return obj;
                    }
                }
        );
        System.out.println("ssss");
      return proxyObject;
    }
}
