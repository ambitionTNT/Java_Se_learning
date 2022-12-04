import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        ps.println("Hello World");
        ps.println("Hello lisi");
        ps.println("Hello wangwu");
        /*
        // 这些是之前System类使用过的方法和属性。
        System.gc();
        System.currentTimeMillis();
        PrintStream ps2 = System.out;
        System.exit(0);
        System.arraycopy(....);
         */
        try {
            // 标准输出流不再指向控制台，指向“log”文件。
            PrintStream printStream = new PrintStream(new FileOutputStream("log"),true);
            // 修改输出方向，将输出方向修改到"log"文件。
            System.setOut(printStream);

            System.out.println("Hello World");
            System.out.println("Hello Kitty");
            System.out.println("Hello lisi");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
