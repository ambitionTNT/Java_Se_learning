import java.lang.reflect.Method;

public class ReflectAnnotationTest {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("MyAnnotationTest");
            //判断类上面是否有@MyAnnotation
            /*System.out.println(c.isAnnotationPresent(MyAnnotation.class));
            if (c.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation myAnnotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);
                System.out.println("类上面的注解对象"+myAnnotation);
                String value = myAnnotation.value();
                System.out.println(value);
            }*/
            Method method = c.getDeclaredMethod("doSome");
            //判斷该方法上是否有注解
            if (method.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
                System.out.println(myAnnotation.userName());
                System.out.println(myAnnotation.password());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
