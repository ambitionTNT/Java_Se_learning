import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
深入try..catch
    1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型。
    2、catch可以写多个。建议catch的时候，精确的一个一个处理。这样有利于程序的调试。
    3、catch写多个的时候，从上到下，必须遵守从小到大。
 */
public class ExceptionTest07 {
    public static void main(String[] args)  {
        //编译报错
/*        try {
            FileInputStream fis = new FileInputStream("D:\\course\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");

        }catch (Exception e){
            System.out.println("文件为找到！");
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            System.out.println("处理异常，这地方无法执行");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //但是catch后的异常就会执行
        System.out.println("hello world!");*/

        /* try {
             FileInputStream fileInputStream = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf")
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }*/
         /*try {
             FileInputStream fileInputStream = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
         } catch (FileNotFoundException e) {
             e.printStackTrace();
             System.out.println("文件没发现");
         }*/
/*         try{
             FileInputStream fileInputStream = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
             // 进行数学运算
             System.out.println(100 / 0); // 这个异常是运行时异常，编写程序时可以处理，也可以不处理。
            fileInputStream.read();
         } catch (IOException e) {
             System.out.println("文件不存在");

         } catch (FileNotFoundException e) {
             System.out.println("文件读失败！");
             e.printStackTrace();
         }*/
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");

        }
        // JDK8的新特性！
        catch (NullPointerException|IOException e) {
            e.printStackTrace();
        }


    }
}
