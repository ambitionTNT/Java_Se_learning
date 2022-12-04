public class TheadTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main move");
    }

    private static void m1() {
        System.out.println("m1()begin");
        m2();
        System.out.println("m1()over");

    }

    private static void m2() {
        System.out.println("m2()begin");
        m3();
        System.out.println("m2()over");
    }

    private static void m3() {
        System.out.println("m3()begin");

        System.out.println("m3()over");
    }
}
