public class ArrayTest11 {
    public static void main(String[] args) {
        String s ="zhangchaunglong";
        // 注意："abc" 这是一个字符串对象，字符串在java中有优待，不需要new也是一个对象。
        // "abc" 字符串也是java对象，属于String类型。
        Object[] objects = { new Husband(),new Wife()};
        Object[] obj = new Object[3];
        obj[0] = new Object();
        obj[1] = new Object();
        obj[2] = new Object();

    }
}


class Husband {

}

class Wife {

}