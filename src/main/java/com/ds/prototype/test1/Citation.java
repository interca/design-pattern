package com.ds.prototype.test1;


/**
 * 浅克隆
 */
public class Citation implements  Cloneable{


    public Student student;



    public  Citation(Student student){
        this.student = student;
    }

    public void setName(String name){
        student.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }
}
