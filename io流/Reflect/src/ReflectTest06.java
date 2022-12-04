import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest06 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        try {
            Class studentClass = Class.forName("java.lang.String");
            s.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getSimpleName()+"{"+"\n");

            Field[] fields = studentClass.getDeclaredFields();
            for (Field field :fields){
                s.append("\t");
                s.append(Modifier.toString(field.getModifiers()));
                s.append(" ");
                s.append(field.getType().getSimpleName());
                s.append(" ");
                s.append(field.getName());
                s.append(";\n");
            }
            s.append("}");
            System.out.println(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
