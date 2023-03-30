package com.ds.prototype.demo;

public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Object clone = realizetype.clone();
        System.out.println(realizetype);
        System.out.println(clone);
        System.out.println(clone == realizetype);
    }
}
