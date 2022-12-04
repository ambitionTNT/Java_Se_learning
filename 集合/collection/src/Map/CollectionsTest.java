package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.synchronizedList(list);
        list.add("jack");
        list.add("rose");
        list.add("Tom");
        list.add("fuck");
        Collections.sort(list);
        for (String s:list){
            System.out.println(s);
        }


    }
}
