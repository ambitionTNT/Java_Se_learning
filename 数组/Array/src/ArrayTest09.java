/*
动态初始化二维数组。
 */
public class ArrayTest09 {
    public static void main(String[] args) {
        int[][] arrays = new int[2][3];
        for (int i =0;i<arrays.length;i++){
            for (int j=0;j<arrays[i].length;j++){
                arrays[i][j] = i*j;
            }
        }
        for (int i =0;i<arrays.length;i++){
            for (int j=0;j<arrays[i].length;j++){
                System.out.print(arrays[i][j]);

            }
            System.out.println("\n");
        }


        int[][] arrs = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i =0;i<arrs.length;i++){
            for (int j=0;j<arrs[i].length;j++){
                System.out.print(arrs[i][j]+" ");

            }
            System.out.println("\n");
        }
    }
}
