import java.io.*;

public class DataOutStreamTest01 {
    /*
java.io.DataOutputStream：数据专属的流。
这个流可以将数据连同数据的类型一并写入文件。
注意：这个文件不是普通文本文档。（这个文件使用记事本打不开。）
 */
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("data"));
            byte b = 100;
            short s= 12;
            int i = 10;
            long l = 1000L;
            float f = 19.0F;
            double d = 218.129;
            boolean sex = false;
            char c = 'a';
            dos.writeByte(b);
            dos.writeChar(c);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeBoolean(sex);
            dos.flush();
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
