import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
异常对象的两个方法：
    String msg = e.getMessage();
    e.printStackTrace(); // 一般都是使用这个。

我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序呢？
    异常信息追踪信息，从上往下一行一行看。
    但是需要注意的是：SUN写的代码就不用看了(看包名就知道是自己的还是SUN的。)。
    主要的问题是出现在自己编写的代码上。
 */
public class ExcetionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            String string = e.getMessage();
            System.out.println(string);
            e.printStackTrace();
            //打印异常堆栈追踪信息！！！
            //在实际的开发中，建议使用这个。养成好习惯！
            // 这行代码要写上，不然出问题你也不知道！
            /*at ExcetionTest09.m3(ExcetionTest09.java:37)
            at ExcetionTest09.m2(ExcetionTest09.java:33)
            at ExcetionTest09.m1(ExcetionTest09.java:29)
            at ExcetionTest09.main(ExcetionTest09.java:17)*/
        }

        System.out.println("Hello World!");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws  FileNotFoundException {
        new FileInputStream("C:\\jetns-agent.jar");
    }
}
