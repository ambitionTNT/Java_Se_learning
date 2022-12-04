package genericReflection;

import javafx.util.Pair;

import java.lang.reflect.*;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @ClassName GenericReflectionTest
 * @Description TODO
 * @Author long
 * @Date 2022/11/8 21:00
 * @Version 1.0
 **/
public class GenericReflectionTest {
    public static void main(String[] args) {
        //read class name from command line args or user input
        String name;
        if (args.length > 0){
            name = args[0];
        }else{
            try(Scanner in = new Scanner(System.in)){

                System.out.print("Enter class name (e.g., java.util.Collections): ");
                name = in.next();
            }
        }
        try{
            //print generic info class and public methods
            Class<?> cl = Class.forName(name);
            printClass(cl);
            for (Method m:cl.getDeclaredMethods()){
                printMethod(m);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printClass(Class<?> cl){
        System.out.print(cl);
//        getTypeParameters用于它返回一个TypeVariable数组，该数组表示由通用声明定义的变量类型。
        printTypes(cl.getTypeParameters(), "<", ",", ">", true);
//        从一个Class对象中，获取该对象父类接收到的参数化类型（泛型）
        Type sc = cl.getGenericSuperclass();
        if (sc != null){
            System.out.print(" extends ");
            printType(sc, false);
        }
        /**
         * Returns the {@code Type}s representing the interfaces
         * directly implemented by the class or interface represented by
         * this object.
         */
        printTypes(cl.getGenericInterfaces()," implements", ", ","",false);
        System.out.println();
    }

    public static void printMethod(Method m){
        String name = m.getName();
        System.out.print(Modifier.toString(m.getModifiers()));
        System.out.print(" ");
        printTypes(m.getTypeParameters(), "<", ", ", ">", true);

        printType(m.getGenericReturnType(), false);
        System.out.print(" ");
        System.out.print(name);
        System.out.print("(");
        printTypes(m.getGenericParameterTypes(), "", ",","", false);
        System.out.println(")");
    }

    public static void printTypes(Type[] types, String pre, String sep, String suf, boolean isDefinition){
        if (pre.equals(" extends ") && Arrays.equals(types, new Type[]{Object.class})){
            return;
        }
        if (types.length > 0){
            System.out.print(pre);
        }
        for (int i = 0; i < types.length; i++){
            if (i > 0){
                System.out.print(sep);
            }
            printType(types[i], isDefinition);
        }
        if (types.length > 0){
            System.out.print(suf);
        }
    }

    /**
     * 打印类型，如具体类型class，泛型变量，通配符，描述泛型类型类或者接口类型
     * @param type：任意以上类型
     * @param isDefinition 是否确定
     */
    public static void printType(Type type, boolean isDefinition){
        //打印类型
        if (type instanceof Class){
            Class t = (Class<?>) type;
            System.out.print(t.getName());
//            TypeVariable是类型变量（泛型变量）
        }else if (type instanceof TypeVariable){
            //描述类型变量
            TypeVariable t = (TypeVariable<?>) type;
            System.out.print(t.getName());
            if (isDefinition){
                //getBounds Returns an array of {@code Type} objects representing the upper
                // bound(s) of this type variable.  Note that if no upper bound is
                // explicitly declared, the upper bound is {@code Object}.
                printTypes(t.getBounds(), " extends ", " & ", "", false);
            }
        }else if (type instanceof WildcardType){
            //打印描述通配符
            WildcardType t = (WildcardType) type;
            System.out.print("?");
            /**
             * Returns an array of {@code Type} objects representing the  upper
             * bound(s) of this type variable.  Note that if no upper bound is
             * explicitly declared, the upper bound is {@code Object}.
             */
            printTypes(t.getUpperBounds(), " extends ", " & ", "", false );
            /**
             * Returns an array of {@code Type} objects representing the
             * lower bound(s) of this type variable.  Note that if no lower bound is
             * explicitly declared, the lower bound is the type of {@code null}.
             * In this case, a zero length array is returned.
             */
            printTypes(t.getLowerBounds(), " super ", " & ", "", false);
        }else if (type instanceof ParameterizedType){
            //描述泛型类型类或者接口类型
            ParameterizedType t = (ParameterizedType) type;
            /**
             * Returns a {@code Type} object representing the type that this type
             * is a member of.  For example, if this type is {@code O<T>.I<S>},
             * return a representation of {@code O<T>}.
             */
            Type owner = t.getOwnerType();
            if (owner != null){
                printType(owner, false);
                System.out.print(".");
            }
            /**
             * Returns the {@code Type} object representing the class or interface
             * that declared this type.
             */
            printType(t.getRawType(), false);
            /**
             * Returns an array of {@code Type} objects representing the actual type
             * arguments to this type.
             */
            printTypes(t.getActualTypeArguments(),"<", ", ",">", false);

        }else if (type instanceof GenericArrayType){
            //描述泛型数组
            GenericArrayType t = (GenericArrayType) type;
            System.out.print("");
            printType(t.getGenericComponentType(), isDefinition);
            System.out.print("[]");
        }

    }
}
