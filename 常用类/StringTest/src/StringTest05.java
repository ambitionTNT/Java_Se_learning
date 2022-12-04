public class StringTest05 {
    public static void main(String[] args) {
        // String类当中常用方法。
        //1（掌握）.char charAt(int index)
        char c = "中国人民共和国".charAt(1);// "中国人"是一个字符串String对象。只要是对象就能“点.”
        System.out.println(c);

        String str = new String("中国人民共和国");
        char[] str1  = new char[10] ;
        str.getChars(0,3,str1,0);
        System.out.println(str1);
        // 2（了解）.int compareTo(String anotherString)
        // 字符串之间比较大小不能直接使用 > < ，需要使用compareTo方法。
        System.out.println("abz".compareTo("abd"));
        //compareToIgnoreCase按字典顺序比较两个字符串，不考虑大小写
        System.out.println("abc".compareToIgnoreCase("ABD"));
        System.out.println("Zbc".compareToIgnoreCase("ABD"));
        // 3（掌握）.boolean contains(CharSequence s)
        // 判断前面的字符串中是否包含后面的子字符串。
        System.out.println("Hello World".contains("Hello"));
        // 4（掌握）. boolean endsWith(String suffix)
        // 判断当前字符串是否以某个子字符串结尾。
        //测试此字符串是否以指定的后缀结束。
        System.out.println("http//www.baidu.com".endsWith(".com"));
        // 5（掌握）.boolean equals(Object anObject)
        // 比较两个字符串必须使用equals方法，不能使用“==”
        // equals方法有没有调用compareTo方法？ 老版本可以看一下。JDK13中并没有调用compareTo()方法。
        // equals只能看出相等不相等。
        // compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小。
        System.out.println("abc".equals("abc"));
        // 6（掌握）.boolean equalsIgnoreCase(String anotherString)
        // 判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("abcd".equalsIgnoreCase("ABCD"));
        // 7（掌握）.byte[] getBytes()
        // 将字符串对象转换成字节数组
        byte[] bytes = "abcd".getBytes();
        for(int i=0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }

        // 8（掌握）.int indexOf(String str)
        // 判断某个子字符串在当前字符串中第一次出现处的索引（下标）。
        System.out.println("中国人民共和国".indexOf("人"));
        // 9（掌握）.boolean isEmpty()
        // 判断某个字符串是否为“空字符串”。底层源代码调用的应该是字符串的length()方法。
        String s = "";
        //String s = "a";
        System.out.println(s.isEmpty());
        // 10（掌握）. int length()
        // 面试题：判断数组长度和判断字符串长度不一样
        // 判断数组长度是length属性，判断字符串长度是length()方法。
        System.out.println("abcddf".length());
        // 11（掌握）.int lastIndexOf(String str)
        // 判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("中国人民共和国".lastIndexOf("国"));
        // 12（掌握）. String replace(CharSequence target, CharSequence replacement)
        // 替换。
        // String的父接口就是：CharSequence
        String netaddr = "http//www.panda.com".replace("http","https");
        System.out.println(netaddr);
        // 13（掌握）.String[] split(String regex)
        // 拆分字符串
        String[] ymd = "1998-10-01".split("-");
        for (int i = 0;i<ymd.length;i++){
            System.out.println(ymd[i]);
        }
        // 14（掌握）、boolean startsWith(String prefix)
        // 判断某个字符串是否以某个子字符串开始。
        System.out.println("中国人民共和国".startsWith("人"));
        // 15（掌握）、 String substring(int beginIndex) 参数是起始下标。
        // 截取字符串
        System.out.println("http//www.panda.com".substring(6));
        // 16（掌握）、String substring(int beginIndex, int endIndex)
        // beginIndex起始位置（包括）
        // endIndex结束位置（不包括）
        System.out.println("http//www.panda.com".substring(6,14));
        // 17(掌握)、char[] toCharArray()
        // 将字符串转换成char数组
        char[] chars1="http//www.panda.com".toCharArray();
        for (int i =0;i<chars1.length;i++){
            System.out.print(chars1[i]);
        }
        System.out.println(chars1);
        // 18（掌握）、String toLowerCase()
        // 转换为小写。
        System.out.println("ABCSDGAUYSGDJASHBDJH".toLowerCase());
        // 19（掌握）、String toUpperCase();
        System.out.println("shaiudgaiyugdjhagsvdjhawsgdigasijd".toUpperCase());
        // 20（掌握）. String trim();
        // 去除字符串前后空白
        System.out.println("    agsduygasiudgaisjugdiausgd  hsgauydgasyugd jasgd sa da   ".trim());
        // 21（掌握）. String中只有一个方法是静态的，不需要new对象
        // 这个方法叫做valueOf
        // 作用：将“非字符串”转换成“字符串”
        String st1 = String.valueOf(true);
        String st2 = String.valueOf(100);
        String st3 = String.valueOf(3.14);

        // 这个静态的valueOf()方法，参数是一个对象的时候，会自动调用该对象的toString()方法吗？
        String s1 = String.valueOf(new Customer());
        System.out.println(s1);

        // 我们是不是可以研究一下println()方法的源代码了？
        System.out.println(100);
        System.out.println(3.14);
        System.out.println(true);
        Object obj = new Object();
        // 通过源代码可以看出：为什么输出一个引用的时候，会调用toString()方法!!!!
        //　本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，再输出。
        System.out.println(obj);
        System.out.println(new Customer());

    }


}
class Customer {
    // 重写toString()方法

    @Override
    public String toString() {
        return "我是一个VIP客户！！！！";
    }
}
