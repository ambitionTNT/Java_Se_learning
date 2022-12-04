package method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName MethodTableTest
 * @Description This program shows how to invoke methods through reflection..
 * @Author long
 * @Date 2022/9/7 14:49
 * @Version 1.0
 **/
public class MethodTableTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method squares = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        //print tables of x- and y-values
        printTable(1,10,10,squares);
        printTable(1,10,10,sqrt);
    }

    /**
     * Return the square of a number...
     * @param x a number
     * @return x squared
     */
    public static double square(double x){
        return x*x;
    }

    /**
     * Prints a table with x- and y-values for amethod
     * @param from the lower bound for the x-values.
     * @param to the upper bound for the x-values.
     * @param n the number of rows in the table.
     * @param f a method with a double parameter and double return value...
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static void printTable(double from, double to, int n, Method f) throws InvocationTargetException, IllegalAccessException {
        //print out the method as table header...
        System.out.println(f);
        double dx = (to-from)/(n-1);
        for (double x = from;x<=to;x+=dx){
            double y = (Double) f.invoke(null,x);
            System.out.printf("%10.4f %10.4f%n",x,y);
        }


    }

}



