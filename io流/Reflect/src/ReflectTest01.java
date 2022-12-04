import java.util.Date;

public class ReflectTest01 {
    /*
    要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.lang.Class实例？
    三种方式：
            */
    public static void main(String[] args) {
        /*
        Class.forName()
           1、静态方法
           2、方法的参数是一个字符串
           3、字符串需要的是一个完整类名
           4、完整类名必须带有包名。java.lang包也不能省略
         */
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");// c1代表String.class文件，或者说c1代表String类型。
            System.out.println(c1);

            c2 = Class.forName("java.util.Date");// c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");// c3代表Integer类型
            Class c4 = Class.forName("java.lang.System");// c4代表System类型



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // java中任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class x = s.getClass();// x代表String.class字节码文件，x代表String类型。
        System.out.println(c1 == x);

        Date date = new Date();
        Class y = Date.class;
        System.out.println(y==c2);
        // 第三种方式，java语言中任何一种类型，包括基本数据类型，它都有.class属性。
        Class z = String.class;
        Class m = Date.class;
        Class f = double.class;
        System.out.println(x==z);

    }
}
