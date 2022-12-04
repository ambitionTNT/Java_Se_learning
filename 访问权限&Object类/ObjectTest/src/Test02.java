public class Test02 {
    public static void main(String[] args) {
        MyTime mt1 = new MyTime(2022,02,04);
        MyTime mt2 = new MyTime(2022,02,04);
        MyTime mt3 = new MyTime(2022,02,07);
        System.out.println(mt1.equals(mt2));
        System.out.println(mt1.equals(mt3));
    }
}
