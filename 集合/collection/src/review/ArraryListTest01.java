package review;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
    1.1、每个集合对象的创建（new）
	1.2、向集合中添加元素
	1.3、从集合中取出某个元素
	1.4、遍历集合
 */
public class ArraryListTest01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("lisi");
        list.add("wanger");
        list.add("zhaoliu");
        // 从集合中取出某个元素
        // List集合有下标
        String firstElt = list.get(0);
        System.out.println(firstElt);
        // 遍历（下标方式）
        for (int i = 0 ;i<list.size();i++){
            String elt = list.get(i);
            System.out.println(elt);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
