package threadSafe2;

import threadSafe.Account;
import threadSafe.AccountThread;

public class Test01 {

    public static void main(String[] args) {
        Account account = new Account("act-1001",10000);
        Thread t1 = new AccountThread(account);
        Thread t2 = new AccountThread(account);

        t1.setName("t1");
        t2.setName("t2");
        //启动线程取款
        t1.start();
        t2.start();

    }

}
