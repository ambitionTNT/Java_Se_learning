public class ThreadTest06 {
    //作用：让当前线程进入休眠，进入“阻塞状态”，放弃占有cup时间片，让给其他线程使用。
    //这个方法出现在A线程中，A线程就会进入休眠
    public static void main(String[] args) {
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");
        */
        for (int i =0 ;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
