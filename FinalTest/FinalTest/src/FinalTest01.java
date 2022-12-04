

public class FinalTest01 {
    //final static  int i = 10;
    public static void main(String[] args) {
        B b =  new B();

       // System.out.println(i);

//        System.out.println(i);
    }
}

class A{

     public void test01(){
         final int i;
         System.out.println();
    }
}
class B extends A{
    public final void test01(){
        System.out.println("B");
    }
}
