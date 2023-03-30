package com.ds.prototype.demo;

public class Realizetype implements  Cloneable{

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Realizetype)super.clone();
    }
}
