public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread thread = new Thread(r);
        thread.setName("t");
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;
    }
}

class MyRunnable4 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            if (run){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                return;
            }

        }
    }
}