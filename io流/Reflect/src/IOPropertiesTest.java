import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

public class IOPropertiesTest {
    public static void main(String[] args) {
        try {
            String path = Thread.currentThread().getContextClassLoader()
                    .getResource("classInfo.properties").toURI().getPath();
            System.out.println(path);
            FileReader fileReader = new FileReader(path);
            Properties properties = new Properties();
            properties.load(fileReader);
            fileReader.close();
            String className = properties.getProperty("className");
            System.out.println(className);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
