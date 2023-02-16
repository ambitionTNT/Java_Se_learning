package IO._08;

/**
 * @ClassName StringBufferTest01
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 16:40
 * @Version 1.0
 **/
public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.append("张传龙");
        sb.append("揍扁了");
        sb.append("潘傻x");
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());

    }
}
