/*获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数。
        1秒 = 1000毫秒

        简单总结一下System类的相关属性和方法：
        System.out 【out是System类的静态变量。】
        System.out.println() 【println()方法不是System类的，是PrintStream类的方法。】
        System.gc() 建议启动垃圾回收器
        System.currentTimeMillis() 获取自1970年1月1日到系统当前时间的总毫秒数。
        System.exit(0) 退出JVM*/
public class DataTest02 {
    public static void main(String[] args) {
        // 获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数。
        long nowTimeMills = System.currentTimeMillis();
        System.out.println(nowTimeMills);
        // 统计一个方法耗时
        // 在调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

    }
    public static void print(){
        for(int i = 0;i<1000;i++){
            //System.out.println(i);
        }
    }
}
