package Map;

import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        // 第一种方式：获取所有的key，通过遍历key，来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Jack");
        map.put(2,"Tom");
        map.put(3,"小潘");
        map.put(4,"张传龙");
        // 遍历Map集合
        // 获取所有的key，所有的key是一个Set集合
        Set<Integer> set = map.keySet();
        // 遍历key，通过key获取value
        // 迭代器可以
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next()));
        }

        for (Integer key:set){
            System.out.println(map.get(key));
        }
        // 第二种方式：Set<Map.Entry<K,V>> entrySet()
        // 以上这个方法是把Map集合直接全部转换成Set集合。
        // Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer,String>> set1 = map.entrySet();
        Set<Map.Entry<Integer,String>>set2 = map.entrySet();
        // 遍历Set集合，每一次取出一个Node
        // 迭代器
        Iterator<Map.Entry<Integer,String>> iterator = set1.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> node = iterator.next();

            System.out.println(node.getKey()+" = "+node.getValue());
        }
        System.out.println("----------------------");
        Iterator<Map.Entry<Integer,String>> it2 = set2.iterator();

        while (it2.hasNext()){
            Map.Entry<Integer,String> node = it2.next();
            System.out.println(node);
        }
        // foreach
        // 这种方式效率比较高，因为获取key和value都是直接从node对象中获取的属性值。
        // 这种方式比较适合于大数据量。
        for (Map.Entry<Integer,String> node :set1){
            System.out.println(node.getKey()+"----->"+node.getValue());
        }
    }
}
