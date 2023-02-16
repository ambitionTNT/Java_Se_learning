package threads;

import java.util.Arrays;

/**
 * @ClassName Bank
 * @Description TODO
 * @Author long
 * @Date 2022/12/15 15:38
 * @Version 1.0
 **/
public class Bank {
    private final double[] accounts;

    /**
     * Constructs the bank
     * @param n the number of accounts
     * @param initialBalance the initial balance for each account
     */
    public Bank(int n, double initialBalance){

        this.accounts = new double[n];
        //Assigns the specified double value to each element of the specified array of doubles.
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from , int to , double amount){
        if (accounts[from] < amount) return;
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d from to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
    }

    /**
     * Gets the sum of all account balances.
     * @return the total balance
     */
    private double getTotalBalance() {
        double sum = 0;
        for (double a:accounts)
            sum += a;

        return sum;
    }

    public int size(){
        return accounts.length;
    }



}
