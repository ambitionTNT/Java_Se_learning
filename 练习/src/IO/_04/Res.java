package IO._04;

import java.io.Closeable;
import java.io.IOException;

/**
 * @ClassName Res
 * @Description TODO
 * @Author long
 * @Date 2022/12/26 11:03
 * @Version 1.0
 **/
public class Res implements Closeable {
    public static void main(String[] args) {
        try (Res res = new Res()){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void close() throws IOException {
        System.out.println("资源释放");
    }
}
