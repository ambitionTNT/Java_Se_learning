package lambda;

/**
 * @ClassName Person
 * @Description TODO
 * @Author long
 * @Date 2022/12/29 17:17
 * @Version 1.0
 **/
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {

        if (this.age == o.getAge()  && this.name == o.getName()){
            return 0;
        }else if (this.age>o.getAge()){
            return 1;
        }else {
            return -1;
        }

    }

}
