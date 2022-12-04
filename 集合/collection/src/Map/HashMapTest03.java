package Map;

import java.util.HashMap;
import java.util.Map;

/*
HashMap集合key部分允许null吗？
    允许
    但是要注意：HashMap集合的key null值只能有一个。
    有可能面试的时候遇到这样的问题。
 */
public class HashMapTest03 {

    public static void main(String[] args) {
        Map map = new HashMap();
        // HashMap集合允许key为null
        map.put(null,null);
        System.out.println(map.size());
        System.out.println(map.get(null));
    }
}
