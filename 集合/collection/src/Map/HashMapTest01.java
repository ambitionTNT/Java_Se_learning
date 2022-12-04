package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
        // 测试HashMap集合key部分的元素特点
        // Integer是key，它的hashCode和equals都重写了。
        Map<Integer,String> map = new HashMap();
        map.put(1,"Jack");
        map.put(2,"Tom");
        map.put(3,"小潘");
        map.put(4,"张传龙");//key重复的时候value会自动覆盖。
        map.put(4,"潘苗");//key重复的时候value会自动覆盖。
        System.out.println(map.size()); // 4
        // 遍历Map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> entry:set){
            // 验证结果：HashMap集合key部分元素：无序不可重复。
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
