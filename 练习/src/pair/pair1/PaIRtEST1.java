package pair.pair1;

/**
 * @ClassName PaIRtEST1
 * @Description TODO
 * @Author long
 * @Date 2022/10/16 20:58
 * @Version 1.0
 **/
public class PaIRtEST1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}


class ArrayAlg{
    /**
     * Gets the minmum and maximum of an array of string
     * @param a an array of strings
     * @return a pair with the min and max values, or null if is null ro empty
     */
    public static Pair<String> minmax(String[] a){
        if (a == null || a.length == 0){
            return null;
        }
        String min = a[0];
        String max = a[0];
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
