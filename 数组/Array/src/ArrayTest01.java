public class ArrayTest01 {
    public static void main(String[] args) {
        int[] a = {100,200,300,400};
        //c++风格
        int a1[] = {100,200,300,400};
        // 所有的数组对象都有length属性
        System.out.println(a.length);
        System.out.println(a1.length);
        // 数组中每一个元素都有下标
        // 通过下标对数组中的元素进行存和取。
        // 取（读）
        System.out.println("第1个元素"+a[0]);
        System.out.println("第2个元素"+a[1]);
        System.out.println("第3个元素"+a[2]);
        // 存（改）
        // 把第一个元素修改为111
        a[0]=111;
        System.out.println(a[0]);
        // 把最后一个元素修改为0
        a[a.length-1]=0;
        System.out.println(a[a.length-1]);
        // 一维数组怎么遍历呢？
        for (int i = 0;i<a.length;i++){
            System.out.println("第"+i+"个元素："+a[i]);
        }
        //地址越界:ArrayIndexOutOfBoundsException
        System.out.println(a[a.length]);

    }

}
