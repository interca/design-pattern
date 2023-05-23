package com.ds.adapter.object_adapter;

/**
 * 适配者类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "读取TFCard";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard写数据 :" +  msg);
    }
}
