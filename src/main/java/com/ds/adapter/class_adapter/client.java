package com.ds.adapter.class_adapter;


public class client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        System.out.println("-------------------从TF中读取--------------------------");
        //定义适配器类
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
