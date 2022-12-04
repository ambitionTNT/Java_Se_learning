public class Test06 {
    public static void main(String[] args) {


            Person p1 = new Person();
        System.out.println( );
            p1=null;


    }
}


class Person{
    // 重写finalize()方法
    // Person类型的对象被垃圾回收器回收的时候，垃圾回收器负责调用：p.finalize();


    @Override
    protected void finalize() throws Throwable {

        System.out.println(this+"已经销毁");
    }

}