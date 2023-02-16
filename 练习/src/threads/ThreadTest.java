package threads;

import java.lang.reflect.ParameterizedType;

/**
 * @ClassName ThreadTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/15 15:19
 * @Version 1.0
 **/
public class ThreadTest {

    public static final int DELAY = 10;
    public static final int STEPS = 100;
    public static final double MAX_AMOUNT = 1000;


    public static void main(String[] args) {
        Bank bank = new Bank(4, 100000);
        Runnable task1 = () ->{
            try {
                for (int i = 0;i < STEPS; i++){
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(0,1,amount);
                    Thread.sleep((int) (DELAY * Math.random()));

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable task2 = () ->{
            try{
                for (int i = 0; i < STEPS; i++){
                    double amount = MAX_AMOUNT*Math.random();
                    bank.transfer(2,3,amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        new Thread(task1).start();
        new Thread(task2).start();

    }
}
