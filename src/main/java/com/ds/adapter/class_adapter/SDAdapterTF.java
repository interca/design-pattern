package com.ds.adapter.class_adapter;

/**
 * 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("使用适配器");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配器");
        writeTF(msg);
    }
}
