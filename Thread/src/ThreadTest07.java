public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t = new MyThread3();

        t.setName("t");
        t.start();
        try {
            //sleep 是让当前线程睡眠
            t.sleep(1000*5);
           /*
            * 因为sleep是 static方法，会转换为Thread.sleep()
            * main才会休眠执行
            * */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello World");
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("分支线程--->"+i);
        }
    }
}