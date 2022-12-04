import javax.print.DocFlavor;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {/*
    自定义注解：MyAnnotation
     */
    //String name();

    //String color() default "green";
    String userName();
    String password();
    //String value () default "Hello World";


}
