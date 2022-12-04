package innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @ClassName AnnoymousInnerClassTest
 * @Description TODO
 * @Author long
 * @Date 2022/10/5 21:16
 * @Version 1.0
 **/
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);
        //keep program running until the user selects 'OK'
        JOptionPane.showConfirmDialog(null,"Quit program?");
        System.exit(0);

    }



}

class TalkingClock{
    /**
     * Starts the clock
     * @param interval the interval between message (in milliseconds)
     * @param beep true if the clock should beep
     */
//     public void start(int interval, boolean beep){
//         ActionListener listener = new ActionListener(){
//
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 System.out.println("At the tone, the time is "+
//                         Instant.ofEpochMilli(e.getWhen()));
//                 if (beep){
//                     Toolkit.getDefaultToolkit().beep();
//                 }
//
//             }
//
//         };
//         Timer timer = new Timer(interval, listener);
//         timer.start();
//
//     }
     public void start(int interval,boolean beep){
         Timer timer = new Timer(interval,e -> {
             System.out.println("At the tone, the time is "+
                     Instant.ofEpochMilli(e.getWhen()));
             if (beep){
                 Toolkit.getDefaultToolkit().beep();
             }
         });
         timer.start();
     }
}
