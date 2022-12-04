import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*java中对日期的处理
        这个案例最主要掌握：
        知识点1：怎么获取系统当前时间
        知识点2：String ---> Date
        知识点3：Date ---> String*/
public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        //分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
        Date date = new Date();
        System.out.println(date);
        // java.util.Date类的toString()方法已经被重写了。
        // 输出的应该不是一个对象的内存地址，应该是一个日期字符串。
        //Sat Feb 19 20:55:34 CST 2022
        // 日期可以格式化吗？
        // 将日期类型Date，按照指定的格式进行转换：Date --转换成具有一定格式的日期字符串-->String
        //SimpleDateFormat是java.text包下的。专门负责日期格式化的。
        //是一个以与语言环境有关的方式来格式化和解析日期的具体类。
        // 它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）和规范化。
        /*
        yyyy 年(年是4位)
        MM 月（月是2位）
        dd 日
        HH 时
        mm 分
        ss 秒
        SSS 毫秒（毫秒3位，最高999。1000毫秒代表1秒）
        注意：在日期格式中，除了y M d H m s S这些字符不能随便写之外，剩下的符号格式自己随意组织。
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String nowTime = simpleDateFormat.format(date);
        System.out.println(nowTime);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String nowTime1 = simpleDateFormat1.format(date);
        System.out.println(nowTime1);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MMMM/dd GGG hh:mm aaa");
        String nowTime3 = simpleDateFormat2.format(date);
        System.out.println(nowTime3);


        // 假设现在有一个日期字符串String，怎么转换成Date类型？
        // String --> Date   2022/02/19 21:07:27
        String time = "2022/02/19 21:07:27";
        //SimpleDateFormat sdf2 = new SimpleDateFormat("格式不能随便写，要和日期字符串格式相同");
        // 注意：字符串的日期格式和SimpleDateFormat对象指定的日期格式要一致。不然会出现异常：java.text.ParseException

        /*SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dateTime = sdf2.parse(time);*/
        Date date1 = simpleDateFormat1.parse(time);
        System.out.println(date1);

    }
}
