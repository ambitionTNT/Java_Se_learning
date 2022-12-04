import java.util.Arrays;

public class ArraysTest01 {
    /**
     * 使用以下SUN公司提供的数组工具类：java.util.Arrays;
     */
    public static void main(String[] args) {
        int[] arr = {112,3,4,56,67,1};
        Arrays.sort(arr);
        for (int i = 0;i < arr.length;i++ ){
            System.out.println(arr[i]);
        }
        int[] arrs  = Arrays.copyOfRange(arr,1,4);
        for (int i = 0;i < arrs.length;i++ ){
            System.out.print(arrs[i]+" ");
        }
    }
}

