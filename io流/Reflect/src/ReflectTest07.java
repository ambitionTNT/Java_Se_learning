import java.lang.reflect.Field;

public class ReflectTest07 {
    public static void main(String[] args) {
        Student student = new Student();

        student.no = 100;
        System.out.println(student.no);
        try {
            //使用反射机制，怎么去访问一个对象的属性。（set get）
            Class studentClass = Class.forName("Student");
            //obj就是student对象。（底层调用无参数的构造方法）
            Object obj = studentClass.newInstance();
            //获取 no 属性(根据属性的名称来获取Field)
            Field field = studentClass.getDeclaredField("no");
        /*
        需要三要素：
        1.obj对象
        2.no属性
        3.1000 值

         */

            //给obj 对象(Student对象)的no 属性赋值
            field.set(obj,10001);

            //读取属性的值
            //俩要素：获取obj对象的no属性的值。
            System.out.println(field.get(obj));
            Field nameField = studentClass.getDeclaredField("name");
            /*nameField.set(obj,"jackson");
            System.out.println(nameField.get(obj));*/
            nameField.setAccessible(true);
            nameField.set(obj,"jackson");
            System.out.println(nameField.get(obj));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
