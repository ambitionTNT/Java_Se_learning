public class Test07 {

    // 静态变量
    static String country;
    // 该类在类的内部，所以称为内部类
    // 由于前面有static，所以称为“静态内部类”
    static class Inner1{

    }
    // 实例变量
    int age;
    // 该类在类的内部，所以称为内部类
    // 没有static叫做实例内部类。
    class Inner2{

    }

    public void doSome(){
        // 局部变量
        int i = 100;
        // 该类在类的内部，所以称为内部类
        // 局部内部类。
        class Inner3{
        }
    }
    public void doOther(){
        // doSome()方法中的局部内部类Inner3，在doOther()中不能用。

    }

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        Compute c = new Computer();
        mm.mySum(c,10,20);

    }
}
interface Compute{
    int sum(int a,int b);
}
class Computer implements Compute{
    public int sum(int a,int b){
        return a+b;
    }
}

class MyMath{
    // 数学求和方法
    public void mySum(Compute c, int x, int y){
        int retValue = c.sum(x, y);
        System.out.println(x + "+" + y + "=" + retValue);
    }
}


