import java.util.ArrayList;
import java.util.Collection;
/*
深入Collection集合的contains方法：
    boolean contains(Object o)
        判断集合中是否包含某个对象o
        如果包含返回true， 如果不包含返回false。

    contains方法是用来判断集合中是否包含某个元素的方法，
    那么它在底层是怎么判断集合中是否包含某个元素的呢？
        调用了equals方法进行比对。
        equals方法返回true，就表示包含这个元素。
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        String s1 = new String("abc");// s1 = 0x11
        c.add(s1);
        String s2 = new String("def");// s2 = 0x2222
        c.add(s2);
        System.out.println(c.size());//2

        String x = new String("abc");//x = 0x5555
        //是否包含x
        System.out.println(c.contains(x));//true,可以判断出，调用了String重写了equals方法
        Collection c1 = new ArrayList();
        String s3 = "hello";
        c1.add(s3);
        String s4 = "hello";
        System.out.println(c1.remove(s4));
        //remove底层也调用了String重写的equals方法
    }
}
