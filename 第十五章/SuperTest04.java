
/*
	1、“this.”和“super.”大部分情况下都是可以省略的。
	2、this. 什么时候不能省略？
		public void setName(String name){
			this.name = name;
		}
	3、super. 什么时候不能省略？
		父中有，子中又有，如果想在子中访问“父的特征”，super. 不能省略。
*/
public class SuperTest04{
	public static void main(String[] args){
		Vip v = new Vip("张三");
		v.shopping();
	}
}

class Customer{
	String name;
	public Customer(){}
	public Customer(String name){
		super();
		this.name = name;
	}

	public void doSome(){
	
		System.out.println(this.name+"do some");
		System.out.println(name);
	
	}
}


class Vip extends Customer{
	// 假设子类也有一个同名属性
	// java中允许在子类中出现和父类一样的同名变量/同名属性。
	String name;
	public Vip(){}
	public Vip(String name){
		super(name);
		
	}
	// super和this都不能出现在静态方法中。
	public void shopping(){
		// this表示当前对象。
		System.out.println(this.name + "正在购物!");
		// super表示的是当前对象的父类型特征。（super是this指向的那个对象中的一块空间。）
		System.out.println(super.name + "正在购物!");
		System.out.println(name + "正在购物!");
	}
}