//带有static的方法
//没有static的方法
//分别怎么调用？
//带有static的方法怎么调用？通过“类名.”的方式访问。


//对象被称为实例。
//实例相关的有：实例变量、实例方法。
//实例变量是对象变量。实例方法是对象方法。
//实例相关的都需要先new对象，通过“引用.”的方式去访问。
public class Method01{
	/*
	public MethodTest(){
	
	}
	*/
	public static void main(String[] args){

		Method01 m1 = new Method01();
		Method01.doSome();
		m1.doOther();
		
	}
	//带有static
	public static void doSome(){
		System.out.println("do some!");
	}

	//这个方法没有static，这样的方法被称为：实例方法。
	//（ 对象方法，对象级别的方法）
	//这个没法解释，大家目前死记硬背。
	public void doOther(){
		System.out.println("do other!");
	}
}