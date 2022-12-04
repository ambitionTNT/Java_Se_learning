import java.util.ArrayList;
import java.util.List;

public class ArraryList01 {
    public static void main(String[] args) {
        // 默认初始化容量是10
        // 数组的长度是10
        List list = new ArrayList();
        System.out.println(list.size());
        // 指定初始化容量
        // 数组的长度是20
        List list1 = new ArrayList(10);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        //list1.add(100);
        /*
        int newCapacity = ArraysSupport.newLength(oldCapacity,minCapacity - oldCapacity,oldCapacity >> 1);
             */
            // 100 二进制转换成10进制： 00000100右移一位 00000010 （2）  【4 / 2】
            // 原先是4、现在增长：2，增长之后是6，增长之后的容量是之前容量的：1.5倍。
            // 6是4的1.5倍
    }
}
