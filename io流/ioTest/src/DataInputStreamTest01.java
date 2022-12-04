import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest01 {
    /*
DataInputStream:数据字节输入流。
DataOutputStream写的文件，只能使用DataInputStream去读。并且读的时候你需要提前知道写入的顺序。
读的顺序需要和写的顺序一致。才可以正常取出数据。

 */
    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("data"));


            byte b = dis.readByte();
            char c = dis.readChar();
            float f = dis.readFloat();
            double d = dis.readDouble();
            short s = dis.readShort();
            int i = dis.readInt();
            long l = dis.readLong();
            boolean sex = dis.readBoolean();


            System.out.println(f);
            System.out.println(d);
            System.out.println(sex);
            System.out.println(i);
            System.out.println(c);
            System.out.println(s);
            System.out.println(l);
            System.out.println(b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
