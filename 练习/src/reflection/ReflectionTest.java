package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @ClassName ReflectionTest
 * @Description This program uses reflection to print all featurens of a class.
 * @Author long
 * @Date 2022/9/6 19:23
 * @Version 1.0
 **/
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //read class name from command line args or user input.

        String name;
        if (args.length > 0){
            name = args[0];
        }else{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }
        // print class name and superclass name (if != Object)
        Class c1 = Class.forName(name);
        Class superc1 = c1.getSuperclass();
        int medi = c1.getModifiers();
        String modifiers = Modifier.toString(medi);
        if (modifiers.length()>0){
            System.out.print(modifiers+" ");
        }
        System.out.print("class "+ name);
        if (superc1 != null && superc1 !=Object.class){
            System.out.print(" extends "+superc1.getName());
        }

        System.out.print("\n{\n");
        printConstructors(c1);
        System.out.println();
        printMethods(c1);
        System.out.println();
        printFields(c1);
        System.out.println("}");

    }

    private static void printConstructors(Class c1) {
        Constructor[] constructors = c1.getDeclaredConstructors();
        for (Constructor c:constructors){
            //得到名字，
            String name = c.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length()>0){

                System.out.print(modifiers+ " "  );
                }
            System.out.print(name +"(");

            //print parameter types
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0 ;j<paramTypes.length;j++){
                if (j>0){
                    System.out.print(",");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");

        }

    }

    /**
     * prints all methods of a class
     * @param c1 a class
     */
    public static void printMethods(Class c1){
        Method[] methods = c1.getDeclaredMethods();
        for (Method m:methods){
            //返回值类型
            Class retType = m.getReturnType();
            //方法名
            String name = m.getName();
            System.out.print( " ");
            //print  modifiers,return type and method name;
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length()>0){
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " +name +"(");
            //print parameter types
            Class[] parameterTypes = m.getParameterTypes();
            for (int j =0;j<parameterTypes.length;j++){
                if (j>0){
                    System.out.print(",");
                }
                System.out.print(parameterTypes[j].getName());
            }
            System.out.println(");");
        }

    }
    public static void printFields( Class c1){
        Field[] fields = c1.getDeclaredFields();

        for (Field f:fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length()>0){
                System.out.print(modifiers+ " ");
            }
            System.out.println(type.getName() + " "+ name + ";");
        }
    }

}
