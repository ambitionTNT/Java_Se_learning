/*
	对象的创建和使用。
*/

public class StudentTest{
	public static void main(String[] args){

		//访问学生姓名可以直接通过类名吗？
		// 学生姓名是一个实例变量。实例变量是对象级别的变量。
		// 是不是应该先有对象才能说姓名的事儿。
		// 不能通过“类名”来直接访问“实例变量”。
		//System.out.println(Student.name);

		Student s1 = new Student();
		System.out.println(s1.name);
		System.out.println(s1.stuId);
		System.out.println(s1.age);
		System.out.println(s1.sex);
		System.out.println(s1.addr);

		System.out.println("-----------------------------");

		Student s2 = new Student();
		System.out.println(s2.name);
		System.out.println(s2.stuId);
		System.out.println(s2.age);
		System.out.println(s2.sex);
		System.out.println(s2.addr);

	   System.out.println("-----------------------------");

		// 程序执行到此处我可以修改s1这个学生的学号吗？
		// 通过“=”赋值的方式将内存中实例变量的值修改一下。

		s1.name = "张三";
		s1.stuId = 100;
		s1.age = 18;
		s1.sex = true;
		s1.addr = "北京市大兴区";




	
		System.out.println(s1.name);
		System.out.println(s1.stuId);
		System.out.println(s1.age);
		System.out.println(s1.sex);
		System.out.println(s1.addr);


	}
}