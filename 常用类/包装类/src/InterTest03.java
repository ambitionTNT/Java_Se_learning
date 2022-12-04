public class InterTest03 {
    public static void main(String[] args) {
        /*
关于Integer类的构造方法，有两个：
    Integer(int)
    Integer(String)
 */


        // Java9之后不建议使用这个构造方法了。出现横线表示已过时。
        // 将数字100转换成Integer包装类型（int --> Integer）
        Integer i = new Integer(100);
        System.out.println(i);
        // 将String类型的数字，转换成Integer包装类型。（String --> Integer）);
        Integer s = new Integer("100");
        // double -->Double
        Double d = new Double(1.23);
        System.out.println(d);
        Double s2 = new Double("20000.009");
        System.out.println(s2);
    }
}
