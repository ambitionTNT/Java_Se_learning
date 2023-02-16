package IO._03;

/**
 * @ClassName FibExerciseTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 20:14
 * @Version 1.0
 **/
public class FibExerciseTest {
    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
    }
    public static long fib(int n){
        if (n <=2){
            return 1;
        }
        return fib(n-1 )+fib(n-2);

    }
}
