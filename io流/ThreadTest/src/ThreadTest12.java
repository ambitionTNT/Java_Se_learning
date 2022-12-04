public class ThreadTest12 {
    public static void main(String[] args) {
        System.out.println("main");
        Thread thread = new Thread(new MyRunnable7());
        thread.setName("t");
        thread.start();
        try {
            thread.join(100000);//t合并到当前线程中看，当前线程受阻，t线程执行受阻

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }
}

class MyRunnable7 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
