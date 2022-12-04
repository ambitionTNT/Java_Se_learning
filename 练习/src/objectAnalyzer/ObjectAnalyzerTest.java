package objectAnalyzer;

import java.util.ArrayList;

/**
 * @ClassName ObjectAnalyzerTest
 * @Description TODO
 * @Author long
 * @Date 2022/9/6 15:41
 * @Version 1.0
 **/
public class ObjectAnalyzerTest {
    public static void main(String[] args) throws IllegalAccessException {
        ArrayList squares = new ArrayList<Integer>();
        for (int i =1;i<=5;i++){
            squares.add(i*i);

        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
