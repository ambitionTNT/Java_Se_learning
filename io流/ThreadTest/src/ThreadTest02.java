public class ThreadTest02 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread myThread = new MyThread();
        //作用 ：启动一个分支线程，在JVM中开辟一个新的栈空间，这段代码就完成了，就结束了。
         //启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部（压栈）
        //run方法在分支栈的栈底部，main方法在主栈的栈底部。run和main是平级的。
        myThread.start();
        for (int i = 0;i<1000;i++){
            System.out.println("主线程---->"+i);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0 ;i<1000;i++){
            System.out.println("分支线程--->"+i);
        }

    }
}
