import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest08 {
    public static void main(String[] args) {
        try {
            //获取类
            Class userServiceClass = Class.forName("service.UserService");
            //获取所有的Method（包括私有的!）
            //获取已经声明的方法
            Method[] methods = userServiceClass.getDeclaredMethods();
            System.out.println(methods.length);
            for (Method method:methods){
                //获取修饰符列表
                System.out.println("----------");
                System.out.println(method.getModifiers());
                System.out.println("-------------");
                //打印了修饰符
                System.out.println(Modifier.toString(method.getModifiers()));
                //获取方法的返回值列表
                System.out.println(method.getReturnType().getSimpleName());
                //获取方法名
                System.out.println(method.getName());
                //方法的修饰符列表
                Class[] parameterTypes =method.getParameterTypes();
                System.out.println();
                System.out.println("------------------------------------");
                for (Class parameterType:parameterTypes){
                    System.out.println(parameterType.getSimpleName());

                }
                System.out.println("-------------------------------------");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
