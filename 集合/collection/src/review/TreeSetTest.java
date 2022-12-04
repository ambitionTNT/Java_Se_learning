package review;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        // 集合的创建（可以测试以下TreeSet集合中存储String、Integer的。这些类都是SUN写好的。）
        //TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(200);
        treeSet.add(20);
        treeSet.add(23);
        treeSet.add(38);
        treeSet.add(55);
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Integer integer:treeSet){
            System.out.println(integer);
        }
        // TreeSet集合中存储自定义类型
        TreeSet<A> aTreeSet = new TreeSet<>();
        aTreeSet.add(new A(100));
        aTreeSet.add(new A(120));
        aTreeSet.add(new A(20));
        aTreeSet.add(new A(32));
        aTreeSet.add(new A(29));
        for (A a:aTreeSet){
            System.out.println(a);
        }

        TreeSet<B> bTreeSet = new TreeSet<>(new BComparator());
        bTreeSet.add(new B(100));
        bTreeSet.add(new B(200));
        bTreeSet.add(new B(20));
        bTreeSet.add(new B(2));
        bTreeSet.add(new B(12));
        for (B b:bTreeSet){
            System.out.println(b.toString());
        }




    }
}

// 第一种方式：实现Comparable接口
class A implements Comparable<A>{
    int i;

    public A(int i){
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }

    @Override
    public int compareTo(A o) {
        //return this.i - o.i;
        return o.i - this.i;
    }
}


class B {
    int i;
    public B(int i){
        this.i = i;
    }

    @Override
    public String toString() {
        return "B{" +
                "i=" + i +
                '}';
    }
}
class BComparator implements Comparator<B>{
    @Override
    public int compare(B o1, B o2) {
        return o1.i-o2.i;
    }
}