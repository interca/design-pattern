package com.ds.principles.demo6;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例模式
 */
public class Client {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        //获取无惨构造方法对象
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        //取消访问检测权限
        declaredConstructor.setAccessible(true);
        //创建对象
        Singleton singleton = declaredConstructor.newInstance();
        Singleton singleton1 = declaredConstructor.newInstance();
        System.out.println(singleton == singleton1);
    }
}
