public class ArraysTest02 {
    /**
     * 好消息：
     *  SUN公司已经为我们程序员写好了一个数组工具类。
     *  java.util.Arrays;
     */
    public static void main(String[] args) {
        int[] arrays = {10,20,30,3,2,4,56};
        /*bubbleSort(arrays);
        for(int i = 0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
        System.out.println();*/
        selectSort(arrays);
        for(int i = 0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
        System.out.println(binarySearch(arrays,3));
    }

    public static void bubbleSort(int[] arr){
        boolean flag = true;
        System.out.println(arr.length);
        for (int i = arr.length-1;flag&&i>0;i--){
            // 6 5 4 3 2 1
            flag = false;
            for (int j = 0;j<i;j++){
                //0 1 2 3 4 5
                if (arr[j]>arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    /**
     * 选择排序算法
     * 每次选择一个最小的
     * @param arr
     */
    public static void selectSort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            int min = i;
            for (int j = i+1 ;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;//将最小的下标记下来
                }
            }
            if(min != i ){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

    }


    public static int  binarySearch(int[] arr,int key){
        int begin = 0;
        int end = arr.length-1;
        while (begin<=end){
            int mid = (begin+end)/2;
            if(key >arr[mid]){
                begin = mid+1;
            }else if(key<arr[mid]){
                end = mid -1;
            }else if(key == arr[mid]){
                return mid;
            }

        }
        return -1;
    }
}


