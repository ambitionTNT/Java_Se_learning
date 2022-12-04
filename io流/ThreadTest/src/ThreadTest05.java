public class ThreadTest05 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("主线程："+currentThread.getName());

        MyThread02 myThread02 = new MyThread02();
       //设置线程名字
        myThread02.setName( "hello");
        System.out.println(myThread02.getName());
        myThread02.start();

        MyThread02 myThread021 = new MyThread02();
        myThread021.setName("world");
        //getName 获取名字
        System.out.println(myThread021.getName());
        //获取当前线程
        myThread021.start();
    }
}


class MyThread02 extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            Thread currentThread = Thread.currentThread();//like this。
            System.out.println("当前线程:"+currentThread.getName()+i);
            System.out.println("supername "+super.getName());
            //System.out.println("分支线程--->"+i);
        }
    }
}
