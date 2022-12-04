public class IntegerTest08 {
    public static void main(String[] args) {
        // String --> int
        int i1 =new Integer("1000");
        int i2 = Integer.parseInt("100");

        System.out.println(i1+1);
        // int --> String
        String string = String.valueOf(1000);
        System.out.println(string);
        String string1 = 100+"";
        System.out.println(string1);
        // int --> Integer
        // 自动装箱
        Integer i = 100;
        int y = i;
        //String-->Integer
        Integer k = Integer.valueOf("100");
        //Integer-->String
        String string2 = String.valueOf(k);
        System.out.println(k);
    }

}
