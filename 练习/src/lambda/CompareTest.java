package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName CompareTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/29 17:13
 * @Version 1.0
 **/
public class CompareTest {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abca";
        System.out.println(str1.compareTo(str2));
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("ab");
        list.add("dde");
        Collections.sort(list);
        System.out.println(list);


    }
    @Test
    public void testComparable(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三",20));
        list.add(new Person("李四",23));
        list.add(new Person("王二", 43));
        //实现Comparable接口就会自动调用compareTo进行比较
        Collections.sort(list);
        System.out.println(list);
        //比较
        System.out.println(new Person("张三",20).compareTo(new Person("李四",23)));
    }
    @Test
    public void testComparator(){
        List<User> list = new ArrayList<>();
        list.add(new User("张三",20));
        list.add(new User("李四",23));
        list.add(new User("王二", 43));
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getAge() == o2.getAge() && o1.getName() == o2.getName()){
                    return 0;
                }else if(o1.getAge() > o2.getAge()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        System.out.println(list);
    }
    @Test
    public void testComparator2(){
        List<User> list = new ArrayList<>();
        list.add(new User("张三",24));
        list.add(new User("李四",23));
        list.add(new User("王二", 43));
        UserComparator uc = new UserComparator();
        Collections.sort(list,uc);
        System.out.println(list);
    }
}


class UserComparator implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {
        if(o1.getAge() == o2.getAge() && o1.getName() == o2.getName()){
            return 0;
        }else if(o1.getAge() > o2.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}
