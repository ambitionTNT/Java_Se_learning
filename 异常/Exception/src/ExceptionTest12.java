public class ExceptionTest12 {
/*
finally语句：
  放在finally语句块中的代码是一定会执行的【再次强调！！！】
*/
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.exit(0);
        }finally {
            System.out.println("finally");
        }
    }
}
