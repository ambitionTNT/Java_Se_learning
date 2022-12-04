package abstractClasses;

/**
 * @ClassName Stdent
 * @Description TODO
 * @Author long
 * @Date 2022/9/3 18:43
 * @Version 1.0
 **/
public class Student extends Person{
    private String major;

    public Student(String name , String major ) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
