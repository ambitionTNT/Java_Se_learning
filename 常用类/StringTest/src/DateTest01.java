public class DateTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
    public static void print(){
        for(int i = 0;i<1000;i++){
            System.out.println(i);
        }
    }
}
