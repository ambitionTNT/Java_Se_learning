public class ExceptionTest02 {
    public static void main(String[] args) {
        // 通过“异常类”实例化“异常对象”
        NumberFormatException numberFormatException = new NumberFormatException("数字格式化异常");
        // java.lang.NumberFormatException: 数字格式化异常！
        System.out.println(numberFormatException);
        // 通过“异常类”创建“异常对象”
        NullPointerException nullPointerException = new NullPointerException("空指针异常");
        //java.lang.NullPointerException: 空指针异常发生了！
        System.out.println(nullPointerException);
    }
}
