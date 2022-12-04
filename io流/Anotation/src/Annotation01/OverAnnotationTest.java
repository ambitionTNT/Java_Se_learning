package Annotation01;

import javax.swing.*;

public class OverAnnotationTest {
    @OverAnnotation(age = 20,email = {"zhangsan@123.com","lisi@126.com"},season = {Season.AUTUMN})
    public void doSome(){
    }
}
