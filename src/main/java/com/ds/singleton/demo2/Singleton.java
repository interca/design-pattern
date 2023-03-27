package com.ds.singleton.demo2;

/**
 * 懒汉式创建数据库
 */
public class Singleton {

    //构造器
    private  Singleton (){};

    private  static  Singleton instance;


    //加上锁线程安全
    public  static synchronized Singleton getInstance(){
        if(instance == null)instance = new Singleton();
        return instance;
    }
}
