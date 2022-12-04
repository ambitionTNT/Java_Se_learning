/*
学生类
	学号：int
	姓名：String
	年龄：int
	性别：boolean
	住址：String

变量必须先声明，再赋值才能访问。

注意：对于成员变量来说，没有手动赋值时，系统默认赋值。
赋的值都是默认值，那么默认值是什么？

类型				默认值
---------------------
byte				0
short				0
int				0
long				0L
float				0.0F
double			0.0
boolean			false
char				\u0000
引用数据类型	null

null是一个java关键字，全部小写，表示空。是引用类型的默认值。

分析：对于成员变量来说，是不是应该一个对象有一份。
	李四有李四的学号
	张三有张三的学号
	李四和张三的学号不一样。所以应该有两块不同的内存空间。

*/




public class Student{
	
	// 这种成员变量又被称为“实例变量”。

	int stuId;

	String name;

	int age;

	boolean sex;

	String addr;







	// 当前的Student这个类当中并没有定义任何构造方法。
	// 但是系统实际上会自动给Student类提供一个无参数的构造方法。
	// 将无参数的构造方法（缺省构造器）写出来
	public Student(){
		System.out.println("无参数的构造方法执行了！");
	}

	// 定义一个有参数的构造方法
	public Student(int i){
	
	}

	/*
		编译器检测到该方法名“Studen”，发现这个名字和类名不一致，
		编译器会认为该方法是一个普通方法，普通方法应该有返回值
		但是没有写返回值类型，所以报错了。
		 错误: 方法声明无效; 需要返回类型
	*/
	/*
	public Studen(String name){
	
	}
	*/

	// 第一种修改方式
	//public void Studen(String name){}

	// 第二种修改方式
	public Student(String name){
	
	}


}