public class ArrayTest02 {
    public static void main(String[] args) {
        // 声明/定义一个数组，采用动态初始化的方式创建
        int a[] = new int[4]; // 创建长度为4的int数组，数组中每个元素的默认值是0
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        //a[4]=500;
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        // 初始化一个Object类型的数组，采用动态初始化方式
        Object[] o = new Object[4];
        for (int i = 0;i<o.length;i++){
            System.out.println(o[i]);
        }
        System.out.println("===============================");
        String[] str1 = new String[4];
        for (int i = 0;i<o.length;i++){
            System.out.println(str1[i]);
        }
        // 采用静态初始化的方式
        String[] str2 = {"C++","java","php"};
        for (int i = 0;i<str2.length;i++){
            System.out.println(str2[i]);
        }
        Object[] obj = {new Object(),new Object(),new Object()};
        for (int i = 0;i<str2.length;i++){
            System.out.println(obj[i]);
        }
    }
}
