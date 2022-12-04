import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest05 {
    public static void main(String[] args) {
        try {
            Class studentClass = Class.forName("Student");
            //getFileds获取的是public修饰的
            Field[] field = studentClass.getFields();
            System.out.println(field);
            System.out.println(field.length);
            Field f = field[0];
            String fName = f.getName();
            System.out.println(fName);

            Field[] fields = studentClass.getDeclaredFields();

            System.out.println(fields.length);
            System.out.println("-----------------------------------------");
            for (Field field1:fields){
                int i = field1.getModifiers();
                System.out.println(i);
                System.out.println(Modifier.toString(i));
                Class c = field1.getType();
                System.out.println(c);
                System.out.println(field1.getName());
              /*  String className = studentClass.getName();
                System.out.print ln(className);*/
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


