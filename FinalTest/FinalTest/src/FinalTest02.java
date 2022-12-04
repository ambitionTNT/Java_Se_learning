public class FinalTest02 {
    public static void main(String[] args) {
        //Person.NAME="tom";
        System.out.println(Person.NAME);
    }
}

class Person{
    public final static String NAME = "jack";

    public Person() {

    }
}
