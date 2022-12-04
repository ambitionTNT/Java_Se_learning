import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTets02 {
    public static void main(String[] args) {
        // ArrayList<这里的类型会自动推断>()，前提是JDK8之后才允许。
        // 自动类型推断，钻石表达式！
        List<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Bird());
        Iterator<Animal> it = list.iterator();
        /*Iterator it2 = list.iterator();
        while (it2.hasNext()){
            it2.next().move();
        }*/
        while (it.hasNext()){
            /*Animal a =it.next();
            a.move();*/
            it.next().move();
        }

        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add("http://www.baidu,com");
        list1.add("http://www.shabi.com");
        // 直接通过迭代器获取了String类型的数据
        Iterator<String > it1 = list1.iterator();
        while (it1.hasNext()){
            String s = it1.next();
            System.out.println(s.substring(7));
        }
    }
}
