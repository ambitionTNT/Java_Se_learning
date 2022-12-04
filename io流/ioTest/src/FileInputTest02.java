import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\JAVA学习\\源码\\io流\\Hello.txt");
            /*while (true){
                int readData = fis.read();
                if (readData==-1){
                    break;
                }
                System.out.println(readData);
            }*/
            int readDate = 0;
            while ((readDate = fis.read())!=-1){

                System.out.println(readDate);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (fis!=null){
                    fis.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
