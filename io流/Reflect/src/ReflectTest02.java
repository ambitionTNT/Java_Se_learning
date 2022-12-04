public class ReflectTest02 {
    /*
    获取到Class,能干什么？
     通过Class的newInstance()方法来实例化对象。
    注意：newInstance()方法内部实际上调用了无参数构造方法，必须保证无参构造存在才可以。
     */
    public static void main(String[] args) {
        try {
            Class c = Class.forName("bean.User");
            Object o = c.newInstance();
            //newInstance() 调用的是无参构造函数，必须保证无参构造是存在的!
            System.out.println(o);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
