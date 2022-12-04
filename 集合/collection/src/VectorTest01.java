import java.lang.reflect.AnnotatedArrayType;
import java.util.*;

public class VectorTest01 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        //新的容量是原来的两倍
        Iterator it = vector.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        List list = new ArrayList();
        Collections.synchronizedList(list);

    }
}
