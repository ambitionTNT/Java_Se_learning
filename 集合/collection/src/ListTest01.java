import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        // 创建List类型的集合。
        //List myList = new LinkedList();
        //List myList = new Vector();
        List list1 = new ArrayList();
        list1.add(100);
        list1.add("100");
        list1.add("he");
        //在列表的指定位置插入指定元素（第一个参数是下标）
        // 这个方法使用不多，因为对于ArrayList集合来说效率比较低。
        list1.add(2,"hello");
        /*Iterator it = list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        Object o = list1.get(0);
        System.out.println(o);
        /*for (int i = 0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }*/
        /*for(int i = 0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }*/

        System.out.println();
        //    返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1
        System.out.println(list1.indexOf("hello"));


        //返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
        System.out.println(list1.lastIndexOf("100"));
        list1.remove(2);
        System.out.println(list1.get(2));
        list1.set(2,"hello");
        System.out.println("------------------");
        System.out.println(list1.get(2));
        System.out.println("--------------------");
        for (Object obj : list1){
            System.out.println(obj);
        }
        System.out.println("----------------");

        list1.remove("hello");
        list1.remove(1);
        for (Object obj : list1){
            System.out.println(obj);
        }
    }
}
