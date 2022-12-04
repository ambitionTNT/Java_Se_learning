import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectTest10 {
    /*
    反编译一个类的构造方法
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Class vipClass = Class.forName("service.Vip");
            stringBuilder.append(Modifier.toString(vipClass.getModifiers()));
            stringBuilder.append(" class ");
            stringBuilder.append(vipClass.getSimpleName());
            stringBuilder.append("public class Vip{\n");
            stringBuilder.append("}");

            Constructor[] constructors = vipClass.getConstructors();
            for (Constructor constructor : constructors){
                stringBuilder.append("\t");
                stringBuilder.append(Modifier.toString((constructor.getModifiers())));
                stringBuilder.append(" ");
                stringBuilder.append(vipClass.getSimpleName());
                stringBuilder.append("(");
                //拼接参数
                Class[] parameterTypes = constructor.getParameterTypes();
                for (Class parameterType:parameterTypes){
                    //删除最后下标位置上的字符
                    stringBuilder.append(parameterType.getSimpleName());
                    stringBuilder.append("){}\n");
                }
                stringBuilder.append("){}\n");
            }
            System.out.println(stringBuilder);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
