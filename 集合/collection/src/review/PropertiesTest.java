package review;

import java.util.Properties;

public class PropertiesTest {
        public static void main(String[] args) {
            Properties pro = new Properties();
            pro.setProperty("username", "test");
            pro.setProperty("password", "test123");
            System.out.println(pro.getProperty("username"));
        }
}
