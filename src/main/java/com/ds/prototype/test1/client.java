package com.ds.prototype.test1;

public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation(new Student());
        citation.setName("123");
        Citation clone = citation.clone();
        clone.setName("hyj");
        System.out.println(citation.student.name);
        System.out.println(clone.student.name);
    }
}
