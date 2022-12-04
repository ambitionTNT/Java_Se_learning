public class AbstractTest01 {
    public static void main(String[] args) {
        PersonClass p1 = new Employee("jack");
        p1.printName();
       // PersonClass p = new PersonClass() ;
    }
}

abstract class PersonClass{
    private String name;

    public PersonClass() {
    }

    public PersonClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(getName());
    }
    //s public  abstract void doSome();
}

class Employee extends PersonClass{

    public Employee(String name) {
        //super.setName(name);
        super(name);
    }
    public void doSome(){

    }

}
