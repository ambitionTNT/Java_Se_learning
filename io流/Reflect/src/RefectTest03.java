import javax.xml.transform.sax.SAXSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class RefectTest03 {
    /*
    验证反射机制的灵活性
验证反射机制的灵活性。
    java代码写一遍，再不改变java源代码的基础之上，可以做到不同对象的实例化。
    非常之灵活。（符合OCP开闭原则：对扩展开放，对修改关闭。）

后期你们要学习的是高级框架，而工作过程中，也都是使用高级框架，
包括： ssh ssm
    Spring SpringMVC MyBatis
    Spring Struts Hibernate
    ...
    这些高级框架底层实现原理：都采用了反射机制。所以反射机制还是重要的。
    学会了反射机制有利于你理解剖析框架底层的源代码。
     */
    public static void main(String[] args) {
        //通过IO流读取classinfo.properties文件
        try {
            FileReader reader = new FileReader("Reflect\\src\\classInfo.properties");
            //创建属性类对象Map
            Properties properties = new Properties();//key value都是String
            //加载
            properties.load(reader);
            //关闭
            reader.close();
            //获取
            String className = properties.getProperty("className");
            Class c = Class.forName(className);
            Object o = c.newInstance();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
