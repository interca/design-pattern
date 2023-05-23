package com.ds.adapter.class_adapter;

/**
 * 适配者类接口
 */
public interface TFCard {
    //从tf卡读取数据

    String readTF();

    void writeTF(String msg);
}
