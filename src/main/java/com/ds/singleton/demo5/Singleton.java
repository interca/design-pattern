package com.ds.singleton.demo5;


import java.io.Serializable;

/**
 * 静态内部类
 */
public class Singleton  implements Serializable {

        private Singleton(){};

        private static class  SingletonHolder{
                //初始化外部类
                private static  final Singleton instance = new Singleton();
        }

        //提供公共的访问方式
        public  static  Singleton getInstance(){
                return SingletonHolder.instance;
        }

        /**
         * 反序列化的时候自动调用该方法，
         * @return
         */
        public  Object readResolve(){
                return SingletonHolder.instance;
        }

}
