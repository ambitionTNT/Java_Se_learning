import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
HashSet集合：
    无序不可重复。
 */
public class HashsetTest01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("heell");
        set.add("a");

        set.add("c");
        /*1、存储时顺序和取出的顺序不同。
        2、不可重复。
        3、放到HashSet集合中的元素实际上是放到HashMap集合的key部分了。*/
        set.add("e");
        set.add("d");
        set.add("d");
        set.add("b");
        set.add("b");
        set.add("试试");
        set.add("bsdsdsds");
        set.add("bsdsdsdsd");
        set.add("b");
        set.add("beef");
        set.add("bfsddf");
        set.add("bweqfdf");
        set.add("bfwedf");
        set.add("bfdf");
        set.add("bfwedf");
        set.add("bfqwedf");
        set.add("bfqwdf");
        set.add("bqwefdf");
        set.add("bfqweqwedf");
        System.out.println(set.size());
        Iterator<String > it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
