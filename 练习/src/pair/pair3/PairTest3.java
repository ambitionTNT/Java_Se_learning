package pair.pair3;



import eqals.Manager;
import eqals.Employee;

import java.util.Collection;

/**
 * @ClassName PairTest3
 * @Description TODO
 * @Author long
 * @Date 2022/10/18 21:44
 * @Version 1.0
 **/
public class PairTest3 {
    public static void main(String[] args) {
        Manager ceo = new Manager("Gus Greedy", 80000, 2003, 12, 15);
        Manager cfo = new Manager("Sid Sneaky",600000, 2003, 12, 15);
        Pair<Manager> buddies = new Pair<>(ceo,cfo);
        printBuddies(buddies);

        ceo.setBonus(100000);
        cfo.setBonus(50000);
        Manager[] managers = {ceo, cfo};

        Pair<Employee> result = new Pair<>();
        minmaxBonus(managers, result);
        System.out.println("first:" + result.getFirst().getName()
        + ", second: " + result.getSecond().getName());
        maxminBonus(managers,result);
        System.out.println("first:" + result.getFirst().getName()
                + ", second: " + result.getSecond().getName());

    }

    public static void printBuddies(Pair<? extends Employee> p){
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() +" and " + second.getName() +" are buddies.");
    }

    /**
     *
     * @param a managers
     * @param result the result set
     */
    public static void minmaxBonus(Manager[]a , Pair<? super Manager> result){
        if (a.length == 0) return;
        Manager max = a[0];
        Manager min = a[0];
        for (int i = 1; i < a.length; i++){

            if (min.getBonus() > a[i].getBonus()){
                min = a[i];
            }
            if (max.getBonus() < a[i].getBonus()){
                max = a[i];
            }
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    /**
     *
     * @param a the array of  managers
     * @param result:result set
     */
    public static void maxminBonus(Manager[] a, Pair<? super Manager> result){
        minmaxBonus(a, result);
        PairAlg.swapHelper(result);
    }
}
class PairAlg{
    public static boolean hasNulls(Pair<?> p){
        return p.getFirst() == null || p.getSecond() ==null;
    }


    public static void swap(Pair<?> p){
        swapHelper(p);
    }
    //通配符进行捕获，既T捕获了？
    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }

}

class Pair<T>{
    private T first;
    private T second;

    public Pair(){
        first = null;
        second = null;

    }

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    public static <T> void addAll(Collection<T> collection, T...ts){
        for (T t:ts){
            collection.add(t);
        }

    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return this.second;
    }


    public void setFirst(T newValue){
        this.first = newValue;

    }

    public void setSecond(T newValue){
        this.second = newValue;
        Double x = new Double(10.23);

    }

}