import java.util.ArrayList;
import java.util.List;

public class ForEaceTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("kitty");
        for (String s :list){
            System.out.println(s);
        }
    }
}
