public class IngeterTest05 {
    public static void main(String[] args) {
        // 900是基本数据类型
        // x是包装类型
        // 基本数据类型 --(自动转换)--> 包装类型：自动装箱
        Integer x = 900;
        System.out.println(x);
        //包装类型-->基本数据类型  自动拆箱
        int y = x;
        System.out.println(y);
        // z是一个引用，z是一个变量，z还是保存了一个对象的内存地址。
        Integer z = 1000;// 等同于 Integer z = Integer(1000);
        System.out.println(z+1);//+ - * /自动拆箱
        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b);

    }
}
