package com.ds.adapter.object_adapter;

/**
 * 适配器类
 * 聚合功能
 */
public class SDAdapterTF  implements SDCard {

    private TFCard tfCard;
    public  SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("使用适配器");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配器");
        tfCard.writeTF(msg);
    }
}
