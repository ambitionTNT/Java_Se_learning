public class StringBufferTest01 {

    public static void main(String[] args) {
        // 使用StringBuilder也是可以完成字符串的拼接。
        // 创建一个初始化容量为16个byte[] 数组。（字符串缓冲区对象）
        StringBuffer stringBuffer = new StringBuffer();
        // 拼接字符串，以后拼接字符串统一调用 append()方法。
        // append是追加的意思。
        stringBuffer.append(100);
        stringBuffer.append(true);
        stringBuffer.append("HelloWorld");
        stringBuffer.append("HelloWorld");
        stringBuffer.append("HelloWorld");
        stringBuffer.append("HelloWorld");
        stringBuffer.append("HelloWorld");

        System.out.println(stringBuffer);

        // 指定初始化容量的StringBuffer对象（字符串缓冲区对象）
        StringBuffer sb = new StringBuffer(100);
        sb.append("1023120310230120301230");
        sb.append("1023120310230120301230");
        sb.append("1023120310230120301230");
        sb.append("1023120310230120301230");
        sb.append("1023120310230120301230");
        sb.append("1023120310230120301230");
        String string = new String("hello");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello world");
        stringBuilder.append("hello world");
        stringBuilder.append("hello world");
        stringBuilder.append("hello world");
        stringBuilder.append("hello world");
        stringBuilder.append("hello world");
        System.out.println(stringBuilder);

        // 字符串不可变是什么意思？
        // 是说双引号里面的字符串对象一旦创建不可变。
        String s = "abc"; //"abc"放到了字符串常量池当中。"abc"不可变。

        // s变量是可以指向其它对象的。
        // 字符串不可变不是说以上变量s不可变。说的是"abc"这个对象不可变。
        s = "xyz";//"xyz"放到了字符串常量池当中。"xyz"不可变。
    }


}
