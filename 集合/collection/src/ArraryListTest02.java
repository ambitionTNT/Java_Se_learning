import java.util.*;

public class ArraryListTest02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList(100);
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);
        //通过这个方式 可以把HashSet集合转换成list集合
        List list2 = new ArrayList(c);
        Iterator it = list2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
