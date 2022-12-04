package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    1.1、每个集合对象的创建（new）
	1.2、向集合中添加元素
	1.3、从集合中取出某个元素
	1.4、遍历集合
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String > map =new HashMap<>();
        map.put(1,"Jack");
        map.put(2,"Tom");
        map.put(3,"zhangsan");
        map.put(4,"lisi");
        System.out.println(map.size());
        System.out.println(map.get(2));
        // 遍历Map集合很重要，几种方式都要会。
        // 第一种方式：先获取所有的key，遍历key的时候，通过key获取value
        Set<Integer> keys = map.keySet();
        for (Integer key :keys){
            System.out.println(key+"="+map.get(key));
        }
        Set<Integer> key1 = map.keySet();
        for (Integer integer:key1){
            System.out.println(map.get(integer));
        }
        // 第二种方式：是将Map集合转换成Set集合，Set集合中每一个元素是Node
        // 这个Node节点中有key和value
        Set<Map.Entry<Integer,String>> nodes = map.entrySet();
        for (Map.Entry<Integer,String> node:nodes){
            System.out.println(node.getKey()+" = "+node.getValue());
        }
        Set<Map.Entry<Integer,String>> entries =map.entrySet();
        for (Map.Entry<Integer,String> entrie:entries){
            System.out.println(entrie.getKey()+entrie.getValue());
        }
    }
}
