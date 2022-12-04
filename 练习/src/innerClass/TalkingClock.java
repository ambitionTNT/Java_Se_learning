package innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;


/**
 * @ClassName TalkingClock
 * @Description TODO
 * @Author long
 * @Date 2022/9/25 22:05
 * @Version 1.0
 **//*
public class TalkingClock {
    private int interval;
    private boolean beep;

    public static void main(String[] args) {
         TalkingClock clock = new TalkingClock(1000,true);
        clock.start();
        //keep program running until the user selects 'OK'
        JOptionPane.showConfirmDialog(null,"Quit program?");
        System.exit(0);

    }


    *//**
     * Constructs a talking clock
     * @param interval the interval between messages (in milliseconds)
     * @param beep true if the clock should beep
     *//*
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }




    *//**
     * Starts the clock
     *//*
    public void start(){
        TimerPrinter listener = new TimerPrinter();
        Timer timer = new Timer(interval, listener);
        timer.start();
    }
    public class TimerPrinter implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone,the time is "
                    + Instant.ofEpochMilli(e.getWhen()));
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

}
*/