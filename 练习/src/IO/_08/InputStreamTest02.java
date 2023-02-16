package IO._08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @ClassName InputStreamTest02
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 17:44
 * @Version 1.0
 **/
public class InputStreamTest02 {
    public static void main(String[] args) throws IOException {
        InputStreamTest02 in = new InputStreamTest02();
        in.test05();
    }
    public void test01() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String name = br.readLine();
        System.out.println("ReadTest Output:" + name);
    }
    public void test02() throws IOException {
        int i = System.in.read();
        System.out.println(i);
    }
    public void test03(){
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();//读取int
        float f = scanner.nextFloat();//读取float
        String s = scanner.nextLine();//读取字符串
        System.out.println(i);
        System.out.println(f);
        System.out.println(s);
    }
    public void test04(){
        //创建Scanner对象,Next()方法遇到空格符是判断为结束
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        // 通过 hasNext()方法判断是否输入已经完成
        if (scanner.hasNext()){
            String str1 = scanner.next();
            System.out.println("Next()方法从键盘获取的字符串是：" + str1);
        }
        scanner.close();
    }
    public void test05(){
        //NextLine()方法遇到回车符号的时候判断为结束
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        // 通过 hasNext()方法判断是否输入已经完成
        if (scanner.hasNextLine()){
            String str1 = scanner.nextLine();
            System.out.println("nextLine()方法从键盘获取的字符串是：" + str1);
        }
        scanner.close();
    }
}
