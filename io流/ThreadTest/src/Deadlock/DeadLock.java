package Deadlock;

public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        //t1\t2共享 o1 o2
        Thread t1 = new MyThread1(o1,o2);
        Thread t2 = new MyThread1(o1,o2);


    }
}



class MyThread1 extends Thread{
    Object o1;
    Object o2;
    public MyThread1(Object O1,Object O2){
        this.o1 = O1;
        this.o2 = O2;

    }

    @Override
    public void run() {
        synchronized (o1){
            synchronized (o2){

            }
        }
    }

    public MyThread1(Runnable target) {
        super(target);
    }
}
class MyThread2 extends Thread{
    Object o1;
    Object o2;
    public MyThread2(Object O1,Object O2){
        this.o1 = O1;
        this.o2 = O2;

    }
    @Override
    public void run() {
        synchronized (o1){
            synchronized (o2){

            }
        }
    }
}