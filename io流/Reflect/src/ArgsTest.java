/*
可变长参数
int...args 这就是可变长参数
语法是：类型...（注意：一定是三个点）


 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,010,01);
        m2(10,"20","2-");
        String[] strs = {"a","b","c"};
        m3("a","b","c");
        m3(strs);
        m3(new String[]{"我","是","中","国","人"});
    }

    public static void m(int...args){
        System.out.println("m方法执行了！");
    }
    public static void m2(int a,String...args1){
        System.out.println("m2的方法执行了！");
    }
    public static void m3(String...arg){
        for (int i = 0;i<arg.length;i++){
            System.out.println(arg[i]);
        }
    }

}
