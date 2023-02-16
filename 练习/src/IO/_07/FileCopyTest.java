package IO._07;

import java.io.*;

/**
 * @ClassName FileCopyTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 16:20
 * @Version 1.0
 **/
public class FileCopyTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\long\\Desktop\\Test\\33.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\long\\Desktop\\Test\\44.txt"));
        //循环读写数据，把读到的数据写入
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }



        br.close();
        bw.close();

    }
}
