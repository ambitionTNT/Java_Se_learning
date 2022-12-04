import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest15 {
    public static void main(String[] args) {
        FutureTask task = new FutureTask(new MyCallable());

        Thread t = new Thread(task);
        t.start();

        //这里是main方法，这是在主线程中。
        //在主线程中，怎么获得t线程的返回结果
        try {
            int o = (int) task.get();
            //main方法这里的程序需要执行必须等待gey方法结束
            //而get方法可能需要很久。因为get()方法是为了拿到另一个线程的执行结果
            //另一个线程执行是需要执行时间的
            System.out.println("Hello World!");
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("Call method begin");
        Thread.sleep(1000 * 10);
        System.out.println("Call method end!");
        int a = 10;
        int b = 20;
        return a + b;
    }
}

