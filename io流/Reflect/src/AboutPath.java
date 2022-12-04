import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;

public class AboutPath {
    public static void main(String[] args) throws URISyntaxException {
        //这种方式的路径缺点是：移植性差，在IDEA中默认的当前路径是project的根
        //离开了IDEA，换到了其他位置，可能当前路径就不是project的根了，这个路径就无效了
       /* try {
            FileReader fileReader = new FileReader("Reflect\\src\\classInfo.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/
        //以下是一种通用的一种路径
        //前提:文件必须在类路径下。
        //就是在src下都是类路径下
        //src是根路径。
        /*
        Thread.currentThread()当前线程对象
        getContextClassLoader() 是线程对象的方法，可以获取当前线程的类加载器对象
        getResource() 这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源。

         */

        String path = Thread.currentThread().getContextClassLoader().getResource("classInfo.properties").toURI().getPath();
        System.out.println(path);


        //获取db.properties文件的绝对路径
        //需要从类的根路径下作为起点
        String path2 = Thread.currentThread().getContextClassLoader().getResource("bean\\db.properties").toURI().getPath();
        System.out.println(path2);
    }
}
