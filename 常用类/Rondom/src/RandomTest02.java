import java.util.Random;

/*
编写程序，生成5个不重复的随机数[0-100]。重复的话重新生成。
最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。
*/public class RandomTest02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i =0;i<arr.length;i++){
            arr[i] = -1;
        }
        Random random = new Random();
        int index = 0;
        while(index<5){
            int temp = random.nextInt(101);
            if (!contains(arr,temp)){
                arr[index++]=temp;

            }
        }
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public  static  boolean contains(int[] arr,int key){
        boolean flag = false;
        for (int i =0;i<arr.length;i++){
            if (key == arr[i]){
                flag = true;
            }
        }
        return flag;
    }
}
