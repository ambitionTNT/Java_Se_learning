package Map;

import java.util.Iterator;
import java.util.SplittableRandom;
import java.util.TreeSet;

/*
1、TreeSet集合底层是一个TreeMap
2、TreeMap集合底层是一个二叉树
3、放到TreeSet集合中的元素，等同于放到TreeMao集合key部分了。
4、TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序
称为：可排序集合
* */
public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<String > treeSet  = new TreeSet<>();
        treeSet.add("zhangsan");
        treeSet.add("lisi");
        treeSet.add("wanger");
        treeSet.add("zhaoliu");
        for(String name :treeSet){
            System.out.println(name);
        }


        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(100);
        integerTreeSet.add(20);
        integerTreeSet.add(2300);
        integerTreeSet.add(2);
        for (Integer integer :integerTreeSet){
            System.out.println(integer);
        }

    }
}
