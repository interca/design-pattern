package com.ds.adapter.object_adapter;

/**
 * 目标接口
 */
public interface SDCard {

    /**
     * 从SDCard读数据
     * @return
     */
    String readSD();

    void writeSD(String msg);
}
