package com.ds.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂
 */
public class ProxyFactory implements MethodInterceptor {

    //获取代理对象,返回值是代理对象的父类
    public  TrainStation getProxy(){
        //创建Enhancer对象
        Enhancer enhancer =new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        System.out.println("ssss");
        return proxyObject;
    }

    //实际增强函数
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object invoke = method.invoke(new TrainStation(), objects);
        return invoke;
    }
}
