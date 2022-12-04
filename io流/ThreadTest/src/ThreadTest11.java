public class ThreadTest11 {
    public static void main(String[] args) {
        /*System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);*/
/*
        Thread curentThread = Thread.currentThread();
        System.out.println(curentThread.getName()+"线程的默认优先级:"+curentThread.getPriority());
*/

        Thread thread = new Thread(new MyRunnable5());
        //thread.setPriority(Thread.MAX_PRIORITY);
        thread.setName("thread");
        thread.start();

        //优先级较高的，只是抢到的cup时间片多一点
        for (int i = 0;i<10000;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
class MyRunnable5 implements Runnable{

    @Override
    public void run() {
        /*System.out.println(Thread.currentThread().getName()+
                "线程默认优先级"+
                Thread.currentThread().getPriority());*/
        for (int i = 0;i<10000;i++){
            if (i%100 == 0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}