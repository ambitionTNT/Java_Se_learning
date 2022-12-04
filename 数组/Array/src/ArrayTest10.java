public class ArrayTest10 {
    public static void main(String[] args) {
        int[][] data = new int[2][];
        data[0] = new int[2];
        data[1] = new int[4];
        data[0][0] = 1;
        data[0][1] = 2;

        data[1][1] = 4;
        data[1][2] = 5;
        data[1][3] = 6;
        //data[1][4] = 7;
       /* System.out.println(data[0][1]);*/
        for(int i =0 ;i<data.length;i++){
            for (int j = 0;j<data[i].length;j++){
                System.out.println(data[i][j]);
            }
        }
        int[][] data1 = {{1,2},{1,2,3,4}};
        for(int i =0 ;i<data.length;i++){
            for (int j = 0;j<data[i].length;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }

    }
}
