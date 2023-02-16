package _super;

/**
 * @ClassName SuperTest
 * @Description TODO
 * @Author long
 * @Date 2023/2/10 10:19
 * @Version 1.0
 **/
import java.util.Date;
public class SuperTest extends Date{
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(super.getClass().getName());
    }

    public static void main(String[]args){
        new SuperTest().test();
    }
}
