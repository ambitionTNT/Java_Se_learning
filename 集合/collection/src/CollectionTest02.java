import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest02  {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        Iterator iterator = c.iterator();
        /*while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }*/
        Collection c1 = new HashSet();
        c1.add(100);
        c1.add(200);
        c1.add("hello world");
        c1.add(10);
        c1.add(0);
        c1.add(100);
        //不论存入的是什么，取出来的一定是object
        Iterator it = c1.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
