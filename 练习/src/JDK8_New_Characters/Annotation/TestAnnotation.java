package JDK8_New_Characters.Annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @ClassName TestAnnotation
 * @Description JD8新特性:重复注解与类型注解
 * @Author long
 * @Date 2023/1/11 0:18
 * @Version 1.0
 **/

public class TestAnnotation {
    private  Object obj = null;
    @MyAnnotation("你好，世界")
    @MyAnnotation("你好，世界")
    public void show(@MyAnnotation("abc") String s){

    }

    @Test
    public void test01() throws NoSuchMethodException {
        Class<TestAnnotation> clazz = TestAnnotation.class;
        Method m1 = clazz.getMethod("show");

        MyAnnotation[] ma = m1.getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation myAnnotation:ma){
            System.out.println(myAnnotation.value());
        }
    }
}
