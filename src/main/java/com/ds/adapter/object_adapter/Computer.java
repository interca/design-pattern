package com.ds.adapter.object_adapter;

/**
 * 定义计算机类
 */
public class Computer {


    //从SDCard读取数据
    public  String readSD(SDCard sdCard){
        if(sdCard == null){
            throw  new NullPointerException("不能为空");
        }
        return sdCard.readSD();
    }

}
