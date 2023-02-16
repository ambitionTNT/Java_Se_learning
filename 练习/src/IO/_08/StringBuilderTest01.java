package IO._08;

/**
 * @ClassName StringBuilderTest01
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 16:27
 * @Version 1.0
 **/
public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("hello world");
        System.out.println(sb);
        sb.append("张传龙 ");
        System.out.println(sb);
        sb.insert(4,"潘傻傻");
        System.out.println(sb);

    }
}
