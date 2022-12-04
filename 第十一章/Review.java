/*
	到目前为止一个类当中可以出现的：
		类体{
			实例变量;
			实例方法;

			静态变量;
			静态方法;

			构造方法;

			静态代码块;
			实例语句块;

			方法(){
				// 局部变量
				int i = 100;
			}
		}
*/


public class Review{
	// 类加载机制中，是这样的：在程序执行之前，凡是需要加载的类全部加载到JVM当中。
	// 先完成加载才会执行main方法。
	static{
		System.out.println("Review类加载时执行！");
	}
	public static void main(String[] args){
		int i = 100;
		Student s1 = new Student("张三","10001");
		s1.study();

	}
}


class Student{
	static{
		System.out.println("static代码块 在类加载的时候执行");
	}

	private String name;
	private String id;
	static String job = "学生";
	public Student(){
		
	}

	public Student(String name,String id){
		this.name = name;
		this.name = id;
	}

	{
		System.out.println("实例语句块，构造方法执行一次，这里就执行一次！");
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}

	public void study(){
		// 私有的是可以在本类中访问的。在其它类中必须使用set和get方法。
		//System.out.println(this.name + "正在努力的学习!");
		//System.out.println(name + "正在努力的学习!");
		System.out.println(this.getName()+"正在努力的学习.");
		//System.out.println(getName() + "正在努力的学习!");
		
		
		// 方法执行到此处表示学习完成了，去吃饭。
		//this.eat();		
		// this.可以省略
		// 编译器检测到eat()方法是实例方法，会自动在eat()方法前添加 this.
		eat();

	}
	public void eat(){
		System.out.println(this.getName() + "在餐厅吃饭呢！！！");
		
		// 调用静态m1()方法
		// 静态方法使用“类名.”的方式访问
		// Student.m1();
		m1();
		// 类名. 可以省略吗？可以。
		// java编译器会自动在m1()方法之前添加“类名.”，因为检测到m1()方法是一个静态方法。

	}

	public static void m1(){
		System.out.println("Student's m1 method execute!");
		// 调用m2()方法
		//Student.m2();
		m2();
	}
	public static void m2(){
		System.out.println("Student's m2 method execute!");
		System.out.println("工作性质：" + job);
		// 编译器检测到job是一个静态变量，所以这里会自动在job前添加：Student.
		//System.out.println("工作性质：" + Student.job);
	}


}