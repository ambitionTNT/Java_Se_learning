@Deprecated//表示整个类以及过时
public class AnnotationTest04 {
    public static void main(String[] args) {


    }
    @Deprecated
    public void doSome(){
        System.out.println("do something");
    }
    public void doOther(){
        System.out.println("do other...");
    }

}
class T{
    public static void main(String[] args) {
        AnnotationTest04 annotationTest04 = new AnnotationTest04();
        annotationTest04.doSome();
    }



}
