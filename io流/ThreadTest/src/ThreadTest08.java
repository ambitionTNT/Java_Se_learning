public class ThreadTest08 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable2());
        thread.setName("潘苗");
        thread.start();

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终断thread线程的睡眠(这种方式采用了异常处理机制)
        thread.interrupt();
    }
}
class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->"+"begin");
        try {//睡了一年
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--->"+"end");
    }


}
