package com.ds.adapter.object_adapter;

/**
 * 具体的SDCard
 */
public class SDCardImpl  implements SDCard {
    @Override
    public String readSD() {
        return "SDCard读数据";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard写数据:" + msg);
    }
}
