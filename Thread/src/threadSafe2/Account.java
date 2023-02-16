package threadSafe2;
/*

不适宜多线程同步机制，会出现安全问题
 */
public class Account {
    private String actNo;
    private double balance;

    public Account() {
    }

    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double money){
        /*
        以下代码必须是线程排队的，不能并发
        一个线程把这里的代码全部执行结束之后，另一个线程才能进来
        synchronized (谁的共享对象){
            //线程同步代码
        }
        ()中的数据特别重要，这个数据是多线程共享的数据，才能达到多线程排队
         写什么？
         那要看你想让哪些线程同步。
         假设t1\t2\t3排队，t4\t5不需要排队。怎么办。
         你一定要在()中写一个t1\t2\t3共享的对象。而这个对象对于t4 t5来说不是共享的。
         填共享对象
         */

        synchronized (this){
            double before = this.getBalance();
            double after  = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }

    }

}
