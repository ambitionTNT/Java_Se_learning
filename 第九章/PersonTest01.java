// 在外部程序中访问Person这个类型中的数据。
public class PersonTest01{
	public static void main(String[] args){
		// 创建Person对象
		Person p1 = new Person();
		// 访问人的年龄
		// 访问一个对象的属性，通常包括两种操作，一种是读数据，一种是改数据。
		// 读数据
		System.out.println(p1.getAge());
		p1.setAge(10);
		System.out.println(p1.getAge());


		// 在PersonTest这个外部程序中目前是可以随意对age属性进行操作的。
		// 一个人的年龄值不应该为负数。
		// 程序中给年龄赋值了一个负数，按说是不符合业务要求的，但是程序目前还是让它通过了。
		// 其实这就是一个程序的bug。
		p1.setAge(-100);
		System.out.println(p1.getAge());



	}
}