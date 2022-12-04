package Map;

import java.util.Properties;
/*
目前只需要掌握Properties属性类对象的相关方法即可。
Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型。
Properties被称为属性类对象。
Properties是线程安全的。
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        // 创建一个Properties对象

        Properties properties = new Properties();
        // 需要掌握Properties的两个方法，一个存，一个取。
        properties.setProperty("url", "jdbc:mysql://localhost:3306/baidu");
        properties.setProperty("driver","com.mysql.jdbc.Driver");
        properties.setProperty("username", "root");
        properties.setProperty("password", "123");
        // 通过key获取value
        System.out.println(properties.getProperty("url"));
      
    }
}
