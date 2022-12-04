package Map;

public class MyClass {
    public static void main(String[] args) {
        MyClass.InnerClass1 class1 = new MyClass.InnerClass1();
        class1.m2();
        class1.m1();;
    }
    public static class InnerClass1{
        public static void m1(){
            System.out.println("静态内部类的m1方法执行。");
        }
        public void m2(){
            System.out.println("静态内部类中的实例方法执行！");
        }
    }

}
