import java.text.DecimalFormat;

public class DecimalTest {
    public static void main(String[] args) {
        // java.text.DecimalFormat专门负责数字格式化的。
        //DecimalFormat df = new DecimalFormat("数字格式");
        /*
        数字格式有哪些？
            # 代表任意数字
            , 代表千分位
            . 代表小数点
            0 代表不够时补0

            ###,###.##
                表示：加入千分位，保留2个小数。
         */
        DecimalFormat decimalFormat = new DecimalFormat("###,###.0000");
        String string = decimalFormat.format(123123123.311);
        System.out.println(string);

    }
}

