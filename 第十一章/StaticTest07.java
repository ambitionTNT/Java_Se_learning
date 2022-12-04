public class StaticTest07{
	static int i = 10;
	// 静态代码块什么时候执行？类加载时执行。
	//可以访问 ，在类加载的时候访问。
		static{
		System.out.println("i="+i);
	}

	//实例方法，在构造方法执行是内存空间才会开辟
	int j = 111 ;


	static{
		//实例变量j可以访问吗？
		//static代码段，类加载的时候执行，这个时候，j还没有开辟内存空间呢。
		//System.out.println(name); 错误: 非法前向引用
		//代码是顺序执行的
	}

	static String name ="zhangsna ";
	public static void main(String[] args){
		
	}
}

/*
总结：
	到目前为止，你遇到的所有java程序，有顺序要求的是哪些？
		第一：对于一个方法来说，方法体中的代码是有顺序的，遵循自上而下的顺序执行。
		第二：静态代码块1和静态代码块2是有先后顺序的。
		第三：静态代码块和静态变量是有先后顺序的。
*/