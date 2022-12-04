public class IntegerTest07 {
    public static void main(String[] args) {
        /*总结一下之前所学的经典异常？
        空指针异常：NullPointerException
        类型转换异常：ClassCastException
        数组下标越界异常：ArrayIndexOutOfBoundsException
        数字格式化异常：NumberFormatException

        Integer类当中有哪些常用的方法呢？*/
        //手动装箱
        Integer x = new Integer(1000);
        //手动拆箱
        int y = x.intValue();
        System.out.println(y);
        Integer a = new Integer("123");
        System.out.println(a);
        // 编译的时候没问题，一切符合java语法，运行时会不会出问题呢？
        // 不是一个“数字”可以包装成Integer吗？不能。运行时出现异常。
        // java.lang.NumberFormatException
        //Integer a = new Integer("中文");
        // 重点方法
        // static int parseInt(String s)
        // 静态方法，传参String，返回int
        //网页上文本框中输入的100实际上是"100"字符串。后台数据库中要求存储100数字，此时java程序需要将"100"转换成100数字。
        int retvalue = Integer.parseInt("123123");//String --> int
        System.out.println();
        double d = Double.parseDouble("3.14");
        System.out.println(d+1);
        float f = Float.parseFloat("1.2");
        System.out.println(f);
        // static String toBinaryString(int i)
        // 静态的：将十进制转换成二进制字符串。
        String string = Integer.toBinaryString(1000);
        System.out.println(string);
        String string2 = Integer.toHexString(16);
        System.out.println(string2);
        String hexString = Integer.toHexString(17);
        System.out.println(hexString);
        //static String toOctalString(int i)
        // 静态的：将十进制转换成八进制字符串。
        String string3 = Integer.toOctalString(8);
        System.out.println(string3);
        System.out.println(new Object());


        // valueOf方法作为了解
        //static Integer valueOf(int i)
        // 静态的：int-->Integer

        Integer i1 = Integer.valueOf(10);
        System.out.println(i1);
        // static Integer valueOf(String s)
        // 静态的：String-->Integer
        Integer i2 = Integer.valueOf("1000");



    }
}
