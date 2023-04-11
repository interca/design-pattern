package com.ds.builder.demo1;

public class client {
    public static void main(String[] args) {
        Director director = new Director(new OfoBuilder());
        Bike construct = director.construct();
        System.out.println(construct.getFrame());
    }
}
