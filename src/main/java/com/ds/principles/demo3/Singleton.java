package com.ds.principles.demo3;

/**
 * 懒汉式双重检查锁
 */
public class Singleton {

    private  Singleton (){};

    private static volatile Singleton instance;



    public  static synchronized Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
