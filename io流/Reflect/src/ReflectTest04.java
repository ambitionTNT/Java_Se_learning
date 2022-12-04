public class ReflectTest04 {
    /*

    研究一下：Class.forName()发生了什么？
    记住，重点：
        如果你只是希望一个类的静态代码块执行，其它代码一律不执行，
        你可以使用：
            Class.forName("完整类名");
        这个方法的执行会导致类加载，类加载时，静态代码块执行。

提示：
    后面JDBC技术的时候我们还需要。
    */
    public static void main(String[] args) {
        try {
            //这个方法的执行会导致类加载
            //如果只希望 一个类的静态代码块执行，可以使用 Class.forName("完整类名")方法
            Class.forName("Myclass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Myclass{
    static {
        System.out.println("static 静态代码块执行了");
    }
}