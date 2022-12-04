package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;


/**
 * @ClassName TimerTest
 * @Description TODO
 * @Author long
 * @Date 2022/9/9 14:42
 * @Version 1.0
 **/
public class TimerTest {
    public static void main(String[] args) {
        TimerPrimer listener = new TimerPrimer();
        //Construct a timer that calls the listener
        //once every second
        Timer timer = new Timer(1000,listener);
        timer.start();


        //keep program running until the user selects "ok
        JOptionPane.showConfirmDialog(null,"Quit program??");
        System.exit(0);
    }
}


class TimerPrimer implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone,the time is " + Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}



