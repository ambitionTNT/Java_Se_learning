import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class IOPropertiseTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("ioTest\\src\\UerInfo");
            Properties pro = new Properties();
            //调用Propertise对象的Load方法将文件中的数据加载到Map集合中
            pro.load(fis);//文件中的数据顺着管道 加载到map集合中
            System.out.println(pro.getProperty("username"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
