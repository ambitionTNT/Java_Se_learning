package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;


/**
 * @ClassName LambdaTest
 * @Description This program demonstrates the use of lambda expressions
 * @Author long
 * @Date 2022/9/13 17:26
 * @Version 1.0
 **/
public class LambdaTest {
    public static void main(String[] args) {
        String[] plants = new String[]{"Mercury","Venus","Earth","Mars","Jupiter","Saturn"
        ,"Uranus","Neptune"};
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted in dictionary order");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));


        System.out.println("Sorted by length");
        Arrays.sort(plants,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(plants));

        Timer timer = new Timer(1000, event-> System.out.println("The time is " + new Date()));
        timer.start();

        //keep program running until user selects "OK"
        JOptionPane.showConfirmDialog(null,"Quit program?");
        System.exit(0);

    }
}
