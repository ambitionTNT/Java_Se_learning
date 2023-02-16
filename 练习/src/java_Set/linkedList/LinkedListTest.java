package java_Set.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @ClassName LinkedListTest
 * @Description This program demonstrates operations on linked lists.
 * @Author long
 * @Date 2022/12/11 14:00
 * @Version 1.0
 * look：当删除b中的元素时，a中之前加入的b的元素也随之删除。
 **/
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");


        LinkedList<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        //merge the words from b into a

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()){
            if (aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

        //remove every second word from b

        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next();//skip one element
            if (bIter.hasNext()){
                bIter.next();//
                bIter.remove();//remove that element
            }
        }
        System.out.println(b);
        //bulk operation:remove al words in b from a
        a.removeAll(b);
        System.out.println(a);

    }
}
