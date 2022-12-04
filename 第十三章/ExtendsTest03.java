public class ExtendsTest03{
	public static void main(String[] args){
		Cat c = new Cat();
		c.move();
		// 通过子类对象访问name可以吗？
		System.out.println(c.name);

	}
}
/*
测试：子类继承父类之后，能使用子类对象调用父类方法吗
	实际上以上的这个问题问的有点蹊跷！！！！！
	哪里蹊跷？“能使用子类对象调用父类方法”
	本质上，子类继承父类之后，是将父类继承过来的方法归为自己所有。
	实际上调用的也不是父类的方法，是他子类自己的方法（因为已经继承过来了
	就属于自己的。）。
		
*/
class Animal{
	String name = "小草";
	public void move(){
		System.out.println(this.name +"正在移动");
	}

}

class Cat extends Animal{
}