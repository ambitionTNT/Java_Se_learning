package Annotation;

/**
 * @ClassName OverrideTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/28 17:43
 * @Version 1.0
 **/
public class OverrideTest {

    /**
     * toString() 在java.lang.Object中定义；
     * 因此，这里用 @Override 标注是对的。
     */
    @Override
    public String toString(){
        return "Override toString";
    }

    /**
     * getString() 没有在OverrideTest的任何父类中定义；
     * 但是，这里却用 @Override 标注，因此会产生编译错误！
     */

    public String getString(){
        return "get toString";
    }

    public static void main(String[] args) {
    }
}
