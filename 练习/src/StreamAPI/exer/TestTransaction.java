package StreamAPI.exer;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @ClassName TestTransaction
 * @Description
 *  1.找出2011年发生的所有交易， 并按交易额排序(从低到高)
 *  2.交易员都在哪些不同的城市工作过?
 *  3.查找所有来自剑桥的交易员，并按姓名排序
 *  4.返回所有交易员的姓名字符串，按字母顺序排序//5。有没有交易员是在米兰工作的?
 *  5.有没有交易员是在米兰工作的?
 *  6.打印生活在剑桥的交易员的所有交易额
 *  7. 所有交易中，最高的交易额是多少
 *  8. 找到交易额最小的交易
 * @Author long
 * @Date 2023/1/8 21:40
 * @Version 1.0
 **/
public class TestTransaction {
    List<Transaction> transactions = null;
    @Before//– 表示在任意使用@Test注解标注的public void方法执行之前执行
    public void before(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    /**
     * 1.找出2011年发生的所有交易， 并按交易额排序(从低到高)
     */
    @Test
    public void test01(){
        transactions.stream()
                .filter((t)->t.getYear()==2011)
                .sorted((t1, t2)->Integer.compare(t1.getValue(),t2.getValue()))
                .forEach(System.out::println);
    }

    /**
     * 2.交易员都在哪些不同的城市工作过?
     */
    @Test
    public void test02(){
        transactions.stream()
                .map((t)->t.getTrader().getCity())
                .forEach(System.out::println);
    }


    /**
     * 3. 查找所有来自剑桥的交易员，并按姓名排序
     */
    @Test
    public void test03(){
        transactions.stream()
                .filter((t)->t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .sorted((t1, t2)->t1.getName().compareTo(t2.getName()))
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * 4.返回所有交易员的姓名字符串，按字母顺序排序.
     */
    @Test
    public void test04(){
        transactions.stream()
                .map((t)->t.getTrader().getName())
                .sorted()
                .distinct()
                .forEach(System.out::println);

        System.out.println("_______________________________________________");
        String str = transactions.stream()
                .map((t)->t.getTrader().getName())
                .sorted()
                .distinct()
                .reduce("",String::concat);
        System.out.println(str);
        System.out.println("_______________________________________________");


        transactions.stream()
                .map((t)->t.getTrader().getName())
                .flatMap(TestTransaction::filterCharacter)
                .sorted((s1,  s2)->s1.compareToIgnoreCase(s2))
                .forEach(System.out::print);

    }

    public static Stream<String> filterCharacter(String str){
        List<String> list= new ArrayList<>();

        for (Character  ch:str.toCharArray()){
            list.add(ch.toString());
        }
        return list.stream();


    }


    /**
     * 5.有没有交易员是在米兰工作的?
     */
    @Test
    public void test05(){
        boolean b1 = transactions.stream()
                .anyMatch((t)->t.getTrader().getCity().equals("Milan"));
        System.out.println(b1);
    }

    /**
     * 6.打印生活在剑桥的交易员的所有交易额
     */
    @Test
    public void test06(){
        Optional<Integer> sum = transactions.stream()
                .filter((t)->t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::sum);
        System.out.println(sum.get());

    }

    /**
     * 7. 所有交易中，最高的交易额是多少
     *
     */

    @Test
    public void test07(){
        Optional<Integer> max = transactions.stream()
                .map((t)->t.getValue())
                .max(Integer::compare);
        System.out.println(max.get());
    }


    /**
     * 8. 找到交易额最小的交易
     */
    @Test
    public void test08(){
        Optional<Integer> min = transactions.stream()
                .map((t)->t.getValue())
                .min(Integer::compare);
        System.out.println(min.get());
    }


}
