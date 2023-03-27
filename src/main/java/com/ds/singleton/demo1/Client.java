package com.ds.singleton.demo1;


import org.testng.annotations.Test;

public class Client {

    @Test
    public  void test(){
        SougouInput sougouInput = new SougouInput();
        sougouInput.setAbstractSkin(new DefaultSkin());
        sougouInput.display();
    }
}
