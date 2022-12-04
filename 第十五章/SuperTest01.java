public class SuperTest01{
	public static void main(String[] args){
		new B();
	}
}

class A extends Object{
	// 建议手动的将一个类的无参数构造方法写出来。
	public A(){
		super();//默认的super方法，初始化Object对象特征
		System.out.println("A类的无参构造方法执行了");
	}
	// 一个类如果没有手动提供任何构造方法，系统会默认提供一个无参数构造方法。
	// 一个类如果手动提供了一个构造方法，那么无参数构造系统将不再提供。
	public A(int a){
		System.out.println("A的有参构造方法执行了");
	}

}
class B extends A{
	public B(){

		this("张三");

		System.out.println("B类的无参构造方法执行了。");
	}
	public B(String name){
		super();
		System.out.println("B类的有参构造方法执行了。");
	}

}