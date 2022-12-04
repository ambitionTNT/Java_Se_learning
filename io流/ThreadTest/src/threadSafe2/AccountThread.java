package threadSafe2;

import threadSafe.Account;

public class AccountThread extends Thread{
    private Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    //两个线程必须共享同一个账户对象
    public void run(){
        //run方法的执行表示取款操作
        //即假设取款5000元钱
        double money = 5000;
        //取款
        //多线程并发执行
        account.withdraw(money);

            System.out.println(Thread.currentThread().getName()+"对"+account.getActno()+"取款"+
                    money+"成功，剩余："+account.getBalance());


        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
