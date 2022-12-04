package Map;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet<Costomer> costomers = new TreeSet<>(new CostumorComparator());
        Costomer c1 = new Costomer(40);
        Costomer c2 = new Costomer(20);
        Costomer c3 = new Costomer(23);
        Costomer c4 = new Costomer(25);
        Costomer c5 = new Costomer(42);
        Costomer c6 = new Costomer(423);
        costomers.add(c1);
        costomers.add(c2);
        costomers.add(c3);
        costomers.add(c4);
        costomers.add(c5);
        costomers.add(c6);
        for(Costomer c:costomers){
            System.out.println(c);
        }
    }
}


class Costomer{
    int age;

    public Costomer(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Costomer{" +
                "age=" + age +
                '}';
    }
}

class CostumorComparator implements Comparator<Costomer>{
    @Override
    public int compare(Costomer o1, Costomer o2) {
        return o1.age-o2.age;
    }
}