import com.sun.xml.internal.ws.api.client.WSPortInfo;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ThreadTest09 {
    //在java中强行终止一个线程
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable3());
        thread.setName("thread");
        thread.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.stop();//已过时
    }
}

class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
