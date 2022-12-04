public class GenericTest03 <hello>{
    public static void main(String[] args) {
        /*
自定义泛型可以吗？可以
    自定义泛型的时候，<> 尖括号中的是一个标识符，随便写。
    java源代码中经常出现的是：
        <E>和<T>
    E是Element单词首字母。
    T是Type单词首字母。
 */
        GenericTest03<String>gt = new GenericTest03<>();
        gt.doSome("1000");
        GenericTest03<Integer> gt2 = new GenericTest03<>();
        gt2.doSome(10000);

        MyInteger<String> mi = new MyInteger<>();
        String s1 = mi.get();

    }
    public void doSome(hello o){
        System.out.println(o);
    }
}

class MyInteger<T>{
    public T get(){
        return null;
    }
}
