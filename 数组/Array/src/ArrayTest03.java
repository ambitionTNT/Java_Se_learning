// 当一个方法上，参数的类型是一个数组的时候。

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] a1 = {100,200,300,4004,005,05,050,50,50};
        int[] a2 = new int[4];
        String[] strings1 = new String[5];
        String[] strings = {"hello","ohhhhh","hiiiiii"};
        printArray(a1);
        printArray(strings);
        System.out.println("================================");
        printArray(a2);
        printArray(strings1);

    }
    public static void printArray(int[] array){
        for (int i =  0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
    public static void printArray(String[] str){
        for (int i =  0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
