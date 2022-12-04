public class ExceptionTest15 {
    public static void main(String[] args) {

        // 创建异常对象（只new了异常对象，并没有手动抛出）
        MyExcetion myExcetion = new MyExcetion("用户名不能为空");
        //打印异常堆栈信息
        myExcetion.printStackTrace();
        String msg = myExcetion.getMessage();
        System.out.println(msg);

    }

}
