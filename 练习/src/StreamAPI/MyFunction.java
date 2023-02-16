package StreamAPI;

/**
 * @ClassName MyFunction
 * @Description TODO
 * @Author long
 * @Date 2023/1/9 20:43
 * @Version 1.0
 **/
public interface MyFunction {
    default String getName(){
        return "Hello World";
    }
}
