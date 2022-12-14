/*
final finally finalize有什么区别？
    final 关键字
        final修饰的类无法继承
        final修饰的方法无法覆盖
        final修饰的变量不能重新赋值。

    finally 关键字
        和try一起联合使用。
        finally语句块中的代码是必须执行的。

    finalize 标识符
        是一个Object类中的方法名。
        这个方法是由垃圾回收器GC负责调用的。
 */
public class ExceptionTest14 {
    public static void main(String[] args) {
        // final是一个关键字。表示最终的。不变的。
        final int i = 100;
        //i = 200;//只能赋值一次
        try {
            System.out.println("Try");
        }finally {
            System.out.println("finally");
        }
        // finalize()是Object类中的一个方法。作为方法名出现。
        // 所以finalize是标识符。
        // finalize()方法是JVM的GC垃圾回收器负责调用。

    }
}

final class A{
    public static final double PI = 3.14;

}
class B {
    public static void doSome(){

    }
}