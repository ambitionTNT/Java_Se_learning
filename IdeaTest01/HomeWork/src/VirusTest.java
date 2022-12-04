public class VirusTest {
    public static void main(String[] args) {
        Person p = new Person("jack",20,true);
        Virus v = new Virus("COV-19",0.00000001,"RNA");
        v.attack(p);

    }
}
