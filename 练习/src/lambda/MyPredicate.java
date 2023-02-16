package lambda;

/**
 * @ClassName MyPredicate
 * @Description TODO
 * @Author long
 * @Date 2022/12/29 18:58
 * @Version 1.0
 **/
@FunctionalInterface
public interface MyPredicate <T> {
    public boolean test(T t);
}
