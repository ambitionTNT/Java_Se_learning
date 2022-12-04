public class IntegeterTest05 {
    public static void main(String[] args) {
        // 900是基本数据类型
        // x是包装类型
        // 基本数据类型 --(自动转换)--> 包装类型：自动装箱
        Integer x = 900;
        System.out.println(x);
        // x是包装类型
        // y是基本数据类型
        // 包装类型 --(自动转换)--> 基本数据类型：自动拆箱
        int y = x;
        System.out.println(y);
        // z是一个引用，z是一个变量，z还是保存了一个对象的内存地址。
        Integer z = 1000; // 等同于：Integer z = new Integer(1000);
        // 分析为什么这个没有报错呢？
        // +两边要求是基本数据类型的数字，z是包装类，不属于基本数据类型，这里会进行自动拆箱。将z转换成基本数据类型
        // 在java5之前你这样写肯定编译器报错。
        System.out.println(z+1);
        Integer a = 1000;// Integer a = new Integer(1000); a是个引用，保存内存地址指向对象。
        Integer b = 1000;// Integer b = new Integer(1000); b是个引用，保存内存地址指向对象。
        System.out.println(a == b); //???
        //这个是false，==不会自动触发拆箱装置

    }
}
