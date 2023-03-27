package com.ds.singleton.demo5;


import java.io.*;

/**
 * 破坏单例模式
 */
public class Client {
    public static void main(String[] args)  {
         writeFile();
         read();
         read();
    }

    public  static  void read()  {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\waili\\Desktop\\a.txt"));
            Singleton singleton = (Singleton) objectInputStream.readObject();
            System.out.println(singleton);
            objectInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public  static void writeFile()  {
        try {
            Singleton instance = Singleton.getInstance();
            ObjectOutputStream objectOutputStream = new
                    ObjectOutputStream(new FileOutputStream(
                            "C:\\Users\\waili\\Desktop\\a.txt"));
            objectOutputStream.writeObject(instance);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}
