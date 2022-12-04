/*3、定义一个人类
属性包括：姓名、年龄、性别
属性私有化，对外提供公开的set和get方法
提供无参数构造和有参数构造
提供一个生病方法：ill()，在该方法中打印信息，例如：张三，男，29岁生病了*/
public class Person {
    private  String name;
    private int age;
    private boolean sex;

    public Person() {
    }

    public Person(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void ill(){
        String sex1;
        if (isSex())
             sex1 = "男";
        else
            sex1 = "女";
        System.out.println(getName()+","+sex1+","+getAge()+"岁生病了。");

    }
}
