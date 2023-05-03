package com.ds.builder.demo2;

public class client {
    public static void main(String[] args) {
      //通过构建着对象获取手机对象
        Phone phone = new  Phone.Builder()
                .cpu("111")
                .mainboard("sss")
                .memory("sss")
                .screen("www")
                .build();
        System.out.println(phone);
    }
}
