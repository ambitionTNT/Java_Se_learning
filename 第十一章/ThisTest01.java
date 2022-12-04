public class ThisTest01{
	public static void main(String[] args){
		Customer c1 = new Customer();
		Customer c2 = new Customer("lisi");

		c1.shopping();
		c2.shopping();
		c1.doSome();
		
	}
}

class Customer{
	String name;
	//构造方法

	public Customer(){

		
	}

	public Customer(String s){
		name = s;
	}
	//顾客购买的方法
	//实例方法
	
	public void shopping(){
		// 这里的this是谁？this是当前对象。
		// c1调用shopping(),this是c1
		// c2调用shopping(),this是c2
		//System.out.println(this.name + "正在购物!");

		// this. 是可以省略的。
		// this. 省略的话，还是默认访问“当前对象”的name。
		System.out.println(name +"正在购物");
		System.out.println(this.name+"正在购物");
	}

	public static void doSome(){
		//System.out.println(this);
	}


}
class Student{


}
