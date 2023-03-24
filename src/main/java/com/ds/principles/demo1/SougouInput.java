package com.ds.principles.demo1;

public class SougouInput {

    AbstractSkin abstractSkin;

    public void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public  void display(){
        abstractSkin.display();
    }
}
