public class LogTest {
    public static void main(String[] args) {

        LogUtil.log("调用了System.out.println()的方法，将结果打印到输出台上");
        LogUtil.log ("调用了System类的gc方法，建议启动垃圾回收器");
    }

}
