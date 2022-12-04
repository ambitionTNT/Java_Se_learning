package objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @ClassName ObjectAnalyzer
 * @Description TODO
 * @Author long
 * @Date 2022/9/6 15:49
 * @Version 1.0
 **/
public class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();



    public String toString(Object object) throws IllegalAccessException {
        if (object ==null){
            return "null";
        }
        //Returns true if this list contains the specified element.
        if (visited.contains(object)) return "...";
        visited.add(object);
        //obtains object's class
        Class c1 = object.getClass();
        //if this object is a String class ....
        if (c1==String.class){
            return (String) object;
        }

//        Determines if the specified {@code Class} object represents a primitive type.
        if (c1.isArray()){
//            它以“ Class”类型的形式返回组件类型。
            String r = c1.getComponentType() + "[]{";
            for (int i =0; i< Array.getLength(object); i++) {
                if (i>0) r += ",";
                Object var = Array.get(object,i);
                //isPrimitive 判断是否为基本数据类型、、、，如果是则直接加上其值
                if (c1.getComponentType().isPrimitive()) r += var;
                    //递归调用
                //否则，递归调用，输出其实例变量的值
                else r += toString(var);
            }
            return r + "}";

        }
        String r = c1.getName();
        //inspect the field of this class and all superclasses
        do {
            r += "[";
            Field[] fields = c1.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);
            //get the names and values of all fields
            for (Field f:fields){

                //getModifiers返回一个整数，描述这个构造器，方法或字段名的字符串。
                if (!Modifier.isStatic(f.getModifiers())) {
                    if (!r.endsWith("[")) r += ",";
                    r += f.getName() + "=";
                    Class t = f.getType();
                    //获取字段的值,如果是基本数据类，就直接加入，否继续递归调用toString方法
                    Object val = f.get(object);
                    if (t.isPrimitive()) r += val;
                    else r += toString(val);
                }
            }
            r += "]";
            c1 = c1.getSuperclass();
        }
        while (c1!=null);


        return r;


    }
}
