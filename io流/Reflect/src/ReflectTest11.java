import service.Vip;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest11 {
    /*
    反编译一个类的Constructor构造方法。
     */
    public static void main(String[] args) {
        Vip v1 = new Vip();

        try {

            //使用反射机制怎么创建对象呢？
            Class c = Class.forName("service.Vip");

            //调用无参构造方法

            Object obj = c.newInstance();

            //调用有参数构造方法
            /*
            1、先获取到这个有参数的构造方法


             */
            //第一步
            Constructor con = c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
            //第二步调用方法new对象

            Object object = con.newInstance(100,"jack","1999-10-1",true);
            System.out.println(object);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
