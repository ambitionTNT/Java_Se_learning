package abstractClasses;

/**
 * @ClassName Person
 * @Description TODO
 * @Author long
 * @Date 2022/9/3 18:24
 * @Version 1.0
 **/
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){

        return "" ;
    }



}
