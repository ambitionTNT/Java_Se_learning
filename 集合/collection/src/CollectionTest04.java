import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest04 {
    /*
关于集合元素的remove
    重点：当集合的结构发生改变时，迭代器必须重新获取，如果还是用以前老的迭代器，会出现
    异常：java.util.ConcurrentModificationException

    重点：在迭代集合元素的过程中，不能调用集合对象的remove方法，删除元素：
        c.remove(o); 迭代过程中不能这样。
        会出现：java.util.ConcurrentModificationException

    重点：在迭代元素的过程当中，一定要使用迭代器Iterator的remove方法，删除元素，
    不要使用集合自带的remove方法删除元素。

 */

    public static void main(String[] args) {
        Collection c = new ArrayList();
        Iterator it = c.iterator();
        c.add(100);
        c.add(200);
        c.add(300);
        // 注意：此时获取的迭代器，指向的是那是集合中没有元素状态下的迭代器。
        // 一定要注意：集合结构只要发生改变，迭代器必须重新获取。
        // 当集合结构发生了改变，迭代器没有重新获取时，调用next()方法时：
        // java.util.ConcurrentModificationException

        /*while (it.hasNext()){
            System.out.println(it.next());
        }*/
        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        Iterator it2 = c2.iterator();
        /*while (it2.hasNext()){
            System.out.println(it2.next());
        }*/
        while (it2.hasNext()){
            Object o = it2.next();
            it2.remove(); // 直接通过集合去删除元素，没有通知迭代器。（导致迭代器的快照和原集合状态不同。）
            System.out.println(o);
            // 删除元素
            // 删除元素之后，集合的结构发生了变化，应该重新去获取迭代器
            // 但是，循环下一次的时候并没有重新获取迭代器，所以会出现异常：java.util.ConcurrentModificationException
            // 出异常根本原因是：集合中元素删除了，但是没有更新迭代器（迭代器不知道集合变化了）
        }
        System.out.println(c2.size());


    }
}
