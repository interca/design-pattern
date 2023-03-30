package com.ds.factory.configFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * 配置文件读取
 * 工厂类
 */
public class CoffeeFactory {
    //加载配置文件的全类名
    //定义咖啡存储容器
    private static HashMap<String,Coffee>map = new HashMap<>();

    //加载配置文件
    static {
        //创建properties对象
        Properties properties  = new Properties();
        //获取输入流
        InputStream resourceAsStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(resourceAsStream);
            //从properties获取全类名并且创建对象
            Set<Object> objects = properties.keySet();
            for (Object object : objects) {
                String classname = properties.getProperty((String) object);
                //反射来创建类
                Class clazz  = Class.forName(classname);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String) object,coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public  static  Coffee getCoffee(String name){
        return map.get(name);
    }

    public static void main(String[] args) {
        System.out.println(getCoffee("american").getName());
    }
}
