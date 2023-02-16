package java_Set.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName ShuffleTest
 * @Description This program demonstrates the random shuffle and sort algorithms
 * @Author long
 * @Date 2022/12/14 10:25
 * @Version 1.0
 **/
public class ShuffleTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i<=49 ; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}

