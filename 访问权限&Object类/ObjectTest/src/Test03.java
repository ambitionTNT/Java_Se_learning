public class Test03 {
    public static void main(String[] args) {
        String s1 ="123";
        String s2 = "123";
        System.out.println(s1 == s2);
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3.equals(s4) );
        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
}
