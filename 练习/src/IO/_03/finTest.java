package IO._03;

/**
 * @ClassName finTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 18:59
 * @Version 1.0
 **/
public class finTest {

    public static void main(String[] args) {
        System.out.println(f(4));
    }

    public static long f(int n){
        if (n == 1){
            return 1;
        }
        return n*f(n-1);
    }
}
