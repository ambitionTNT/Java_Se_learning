/*八种包装类中其中6个都是数字对应的包装类，他们的父类都是Number，可以先研究一下Number中公共的方法：
        Number是一个抽象类，无法实例化对象。
        Number类中有这样的方法：
        byte byteValue() 以 byte 形式返回指定的数值。
abstract  double doubleValue()以 double 形式返回指定的数值。
abstract  float floatValue()以 float 形式返回指定的数值。
abstract  int intValue()以 int 形式返回指定的数值。
abstract  long longValue()以 long 形式返回指定的数值。
        short shortValue()以 short 形式返回指定的数值。
        这些方法其实所有的数字包装类的子类都有，这些方法是负责拆箱的。*/
public class IntegerTest02 {
    public static void main(String[] args) {
        // 123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换。
        // 基本数据类型 -(转换为)->引用数据类型（装箱）
        Integer i = new Integer(123);
        Integer j = new Integer(123);
        System.out.println(i);
        System.out.println(j);
        // 将引用数据类型--(转换为)-> 基本数据类型
        float f = i.floatValue();
        System.out.println(f); //123.0
        double d = i.doubleValue();
        System.out.println(d);
        // 将引用数据类型--(转换为)-> 基本数据类型（拆箱）
        int retValue = i.intValue();
        System.out.println(retValue); //123

    }
}
