package Map;

import java.util.*;
import java.util.concurrent.Callable;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"老潘");
        map.put(2,"小潘");
        map.put(3,"张传龙");
        map.put(4,"哈哈哈");
        Object value = map.get(1);
        System.out.println(value );
        Map map1 = new HashMap();
        map1.put(1,"hhh");
        Object o = map1.get(1);
        System.out.println(o);
        System.out.println(map.size());
        map.remove(1);
        System.out.println(map.size());
        // 判断是否包含某个key
        // contains方法底层调用的都是equals进行比对的，所以自定义的类型需要重写equals方法。
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue(new String("张传龙")));
        Set<Integer> set = map.keySet();
        for (Integer integer:set){
            System.out.println(integer);
        }
        Collection<String> collections = map.values();
        for(String s :collections){
            System.out.println(s);
        }




    }
}
