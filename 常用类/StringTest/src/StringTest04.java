import java.sql.SQLOutput;

/**
 * 关于String类中的构造方法。
 *  第一个：String s = new String("");
 *  第二个：String s = ""; 最常用
 *  第三个：String s = new String(char数组);
 *  第四个：String s = new String(char数组,起始下标,长度);
 *  第五个：String s = new String(byte数组);
 *  第六个：String s = new String(byte数组,起始下标,长度)
 */
public class StringTest04 {
    public static void main(String[] args) {
        // 创建字符串对象最常用的一种方式
        String str = "Hello World!";
        // str这个变量中保存的是一个内存地址。
        // 按说以下应该输出一个地址。
        // 但是输出一个字符串，说明String类已经重写了toString()方法。
        System.out.println(str);
        System.out.println(str.toString());
        // 这里只掌握常用的构造方法
        char[] chars={'h','e','l','l','o'};
        String str1 = new  String(chars);
        System.out.println(str1);
        byte[] bytes = {97, 98, 99}; // 97是a，98是b，99是c
        String str2 = new String(bytes);
        System.out.println(str2);
        // 前面说过：输出一个引用的时候，会自动调用toString()方法，默认Object的话，会自动输出对象的内存地址。
        // 通过输出结果我们得出一个结论：String类已经重写了toString()方法。
        // 输出字符串对象的话，输出的不是对象的内存地址，而是字符串本身。
        String  str3 = new String(bytes,1,2);
        System.out.println(str3.toString());


    }

}
