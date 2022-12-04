public class ThreadTest03 {
    public static void main(String[] args) {
        //创建线程对象
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
        for (int i = 0;i<1000;i++){
            System.out.println("主线程---->"+i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0 ;i<1000;i++){
            System.out.println("分支线程--->"+i);
        }
    }
}
