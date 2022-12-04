import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arrays = {10,20,30,3,2,4,56};
        Arrays.sort(arrays);
        int index = Arrays.binarySearch(arrays,30);

        System.out.println(index);
    }
}
