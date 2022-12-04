package pair.pair2;


import java.time.LocalDate;
import java.util.Collection;

/**
 * @ClassName PairTest2
 * @Description TODO
 * @Author long
 * @Date 2022/10/17 19:56
 * @Version 1.0
 **/
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1815,12, 10),
                LocalDate.of(1903, 12, 3),
                LocalDate.of(1910, 4, 9),
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);


        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class ArrayAlg{
    /**
     * Gets the minimum and maximum of an array of objects of type T
     * @param a an array of objects of type T
     * @param <T>
     * @return a pair with the min and max values, or null a is null or empty
     */
    public static <T extends Comparable>Pair<T> minmax(T[] a){
        if (a == null || a.length == 0){
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 1; i<a.length; i++){
            if (min.compareTo(a[i]) > 0){
                min = a[i];
            }
            if (max.compareTo(a[i])<0){
                max = a[i];
            }
        }
        return new Pair<>(min,max);
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
    public static <T> void addAll(Collection<T> collection,T...ts){
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


