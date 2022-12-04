
/*
	当前程序存在的问题（设计上的问题）？？？？
		鸟儿在执行move()方法的时候，最好输出的结果是：“鸟儿在飞翔”
		但是当前的程序在执行move()方法的时候输出的结果是："动物在移动！"
		很显然Bird子类从Animal父类中继承过来的move()方法已经无法满足子类的业务需求。

*/

public class Override01{
	public static void main(String[] args){
		Cat c = new Cat();
		c.move();
		Bird b = new Bird();
		b.move();
		b.sing(10000);

	}
}

class Animal{
	public void move(){
		System.out.println("动物在移动");
	}
	public void sing(int i){
		System.out.println("animal is singing");
	}
}

class Cat extends Animal{
	// 猫在移动的时候，我希望输出：猫在走猫步！！！！！！
	public void move(){
		System.out.println("CAT在走猫步");
	}
}

class Bird extends Animal{// 子类继承父类中，有一些“行为”可能不需要改进，有一些“行为”可能面临着必须改进。
	// 因为父类中继承过来的方法已经无法满足子类的业务需求。

	// 鸟儿在移动的时候希望输出鸟儿在飞翔！！！！
	// 对move方法进行方法覆盖，方法重写，override
	// 最好将父类中的方法原封不动的复制过来。（不建议手动编写）
	// 方法覆盖，就是将继承过来的那个方法给覆盖掉了。继承过来的方法没了。
	/*
	public void move(){
		System.out.println("小鸟在飞翔");

	}
	*/

	// 分析：这个sing()和父类中的sing(int i)有没有构成方法覆盖呢？
	// 没有，原因是，这两个方法根本就是两个完全不同的方法。
	// 可以说这两个方法构成了方法重载吗？可以。
	public void sing(){
		System.out.println("Bird sing.....");
	}
	//protected表示受保护的。没有public开放。
	// 错误：正在尝试分配更低的访问权限; 以前为public
	/*
	protected void move(){
		System.out.println("鸟儿在飞翔！！！");
	}
	*/

		//错误：被覆盖的方法未抛出Exception
	/*
	public void move() throws Exception{
		System.out.println("鸟儿在飞翔！！！");
	}
	*/
}