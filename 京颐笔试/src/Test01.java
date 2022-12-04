public class Test01 {
    /*给定有奇数个元素的整数数组arr，数组中没有重复元素，求数组中大小处于中间的元素的位置。
   arr=[6,7,4,5,1,2,3]，中间值为(4)，(4)在第3位，所以答案为3。*/
    public static void main(String[] args) {
        int[] arr= {6,7,4,5,1,2,3};

        System.out.println(returnMidValue(arr));
    }

    public static int returnMidValue(int[] arr){
        bubbleSort(arr,arr.length);

        return arr[arr.length/2-1];
    }


    //冒泡排序一下或者使用Array.sort(arr)
    public static void bubbleSort(int[] array, int n){
        int i, j, k;
        for(i=0; i<n-1; i++)
            for(j=0; j<n-1-i; j++){
                if(array[j]>array[j+1]){
                    k=array[j];
                    array[j]=array[j+1];
                    array[j+1]=k;
                }
            }
    }
}
