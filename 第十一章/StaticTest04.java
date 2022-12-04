public class StaticTest04{
	public static void main(String[] args){
		StaticTest04.doSome();
		StaticTest04 st = new StaticTest04();
		st.doOther();
		st.doSome();
		st = null ;
		//st.doOther();
		st.doSome();

	}

	// 静态方法（静态方法不需要new对象，直接使用“类名.”来访问）
	// 但是也可以使用“引用.”来访问，不建议用。（因为其他程序员会感到困惑。）
	public static void doSome(){
		System.out.println("静态方法dosome");
	}
	public void doOther(){
		System.out.println("实例方法doOther");
	}

// 从第一天开始讲解HelloWorld到目前为止，一个类当中一共就写过这些东西。
/*
	类{
		实例相关的，都需要new对象的，通过引用.访问.
		实例变量
		实例方法
		静态相关的，都是采用 类名.方法访问。，也可以采用，引用. 但是最终 还是转换为相关类.
		静态变量。
		静态方法。
	}




*/


}