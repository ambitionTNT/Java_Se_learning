public class ThreadTest04 {
    public static void main(String[] args) {
        /**
         * 通过匿名内部类的方式实现多线程
         */
        Thread thread  = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("分支线程--->"+i);
                }
            }
        });
        thread.start();
        for (int i=0;i<100;i++){
            System.out.println("主线程--->"+i);
        }
    }
}
