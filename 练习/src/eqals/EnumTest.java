package eqals;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * @ClassName EnumTest
 * @Description TODO
 * @Author long
 * @Date 2022/9/4 22:06
 * @Version 1.0
 **/
public class EnumTest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a size :(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size=" +size);
        System.out.println("abbreviation=" +size.getAbbreviation());
        if (size == Size.EXTRA_LARGE){
            System.out.println("Good job--yopu paid attention to the _");
        }

        System.out.println("-----------------------------");
        System.out.println(size.compareTo(Size.LARGE));

    }




}