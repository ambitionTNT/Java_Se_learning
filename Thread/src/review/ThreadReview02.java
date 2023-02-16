package review;

public class ThreadReview02 {
    public static void main(String[] args) {
        MyThreadRunable myThreadRunable = new MyThreadRunable();
        Thread thread = new Thread(myThreadRunable);
        thread.start();
        for (int i = 0;i<100;i++){
            System.out.println("主线程----->"+i);
        }
    }
}

class MyThreadRunable implements Runnable {
    @Override
    public void run() {
        for(int i =0;i<100;i++){
            System.out.println("分支线程----->"+i);
        }
    }
}