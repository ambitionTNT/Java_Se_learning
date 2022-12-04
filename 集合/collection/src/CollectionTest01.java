import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Phaser;

public class CollectionTest01 {

    public static void main(String[] args) {
        //创建集合对象
       //使用了多态
        Collection c = new ArrayList();
        //测试一下常用的方法
        c.add(100);
        c.add("张三");
        c.add("hello wolrld");
        c.add(new Person());
        /*size()集合元素的个数
        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());*/
        //测试集合中是否包含"张三"
        System.out.println(c.contains("张三"));
        c.add("潘苗");
        c.add("silly ege");
        System.out.println(c.contains("潘苗"));
        System.out.println(c.size());
        //测试是否为空
        System.out.println(c.isEmpty());
        //移除“张三”
        c.remove("张三");
        System.out.println(c.contains("张三"));

        //转换为数组
        Object[] objects=c.toArray();
        for (int i = 0 ;i<objects.length;i++){
            System.out.println(objects[i]);
        }
       /* Iterator it = c.iterator();
        *//*
            以下两个方法是迭代器对象Iterator中的方法：
                boolean hasNext()如果仍有元素可以迭代，则返回 true。
                Object next() 返回迭代的下一个元素,并且向下走以为。
         *//*
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }*/
        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}


class Person{

}