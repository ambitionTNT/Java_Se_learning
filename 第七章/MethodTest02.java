public class MethodTest02{
	public static void main(String[] args){
		int result = m();
		System.out.println(result);

	}


	public static int m(){
		boolean flag = true; //编译器不负责运行程序，编译器只讲道理。
		// 对于编译器来说，编译器只知道flag变量是boolean类型
		// 编译器会认为flag有可能是false，有可能是true
		if(flag){
			// 编译器觉得：以下这行代码可能会执行，当然也可能不会执行
			// 编译器为了确保程序不出现任何异常，所以编译器说：缺少返回语句
			return 1;
			System.out.println("hello");
		}else{
			return 0;
		}

	}
}