import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
TreeSet集合存储元素特点：
    1、无序不可重复的，但是存储的元素可以自动按照大小顺序排序！
    称为：可排序集合。

    2、无序：这里的无序指的是存进去的顺序和取出来的顺序不同。并且没有下标。
 */
public class TreesetTest01 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("A");
        stringSet.add("W");
        stringSet.add("Q");
        stringSet.add("R");
        stringSet.add("G");
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
