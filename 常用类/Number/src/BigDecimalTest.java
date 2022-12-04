import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(12);
        System.out.println(bigDecimal);
        BigDecimal bigDecimal1 = new BigDecimal(1203102.123123);
        BigDecimal bigDecimal2  = bigDecimal.add(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal1.divide(bigDecimal));
    }
}
