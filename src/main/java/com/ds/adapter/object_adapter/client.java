package com.ds.adapter.object_adapter;


public class client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        System.out.println("-------------------从TF中读取--------------------------");
        String s1 = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(s1);
    }
}
