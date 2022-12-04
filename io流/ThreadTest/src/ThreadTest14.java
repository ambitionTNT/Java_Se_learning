public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t = new BakeDataThread();
        t.setName("备份数据的线程");
        //启动线程之前，将线程设置成守护线程
        t.setDaemon(true);
        t.start();
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BakeDataThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.println(Thread.currentThread().getName()+"--->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
