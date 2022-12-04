import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest04 {
    public static void main(String[] args) {
        FileInputStream  fis = null;
        try {
            fis = new FileInputStream("ioTest//src//tempFile01");

            // 准备一个byte数组
            byte[] bytes = new byte[4];
            /*while (true){
                int readData = fis.read();
                if (readData == -1){
                    break;
                }
                System.out.println(readData);
            }*/

            int readCount = 0;
            while ((readCount = fis.read(bytes))!=-1){
                System.out.println(readCount);
                System.out.println(new String(bytes,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
