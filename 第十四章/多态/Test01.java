public class Test01{
	public static void main(String[] args){
		Animal a1 = new Animal();
		a1.move();
		
		Cat c1 = new Cat();
		c1.move();

		Bird b1 = new Bird();
		b1.move();
		//代码可以这样写吗？
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		/*
			1、Animal和Cat之间有继承关系吗？有的。
			2、Animal是父类，Cat是子类。
			3、Cat is a Animal，这句话能不能说通？能。
			4、经过测试得知java中支持这样的一个语法：
				父类型的引用允许指向子类型的对象。
				Animal a2 = new Cat();
				a2就是父类型的引用。
				new Cat()是一个子类型的对象。
				允许a2这个父类型引用指向子类型的对象。
		*/


		
		// 没有继承关系的两个类型之间存在转型吗？
		// 错误: 不兼容的类型: Dog无法转换为Animal
		 //Animal a4 = new Dog();

		// 调用a2的move()方法
		/*
			什么是多态？
				多种形态，多种状态。
			分析：a2.move();
				java程序分为编译阶段和运行阶段。
				先来分析编译阶段：
					对于编译器来说，编译器只知道a2的类型是Animal，
					所以编译器在检查语法的时候，会去Animal.class
					字节码文件中找move()方法，找到了，绑定上move()
					方法，编译通过，静态绑定成功。（编译阶段属于静态绑定。）
				再来分析运行阶段：
					运行阶段的时候，实际上在堆内存中创建的java对象是
					Cat对象，所以move的时候，真正参与move的对象是一只猫，
					所以运行阶段会动态执行Cat对象的move()方法。这个过程
					属于运行阶段绑定。（运行阶段绑定属于动态绑定。）

			多态表示多种形态：
				编译的时候一种形态。
				运行的时候另一种形态。
		*/
		a2.move();
		a3.move();

		// 分析这个程序能否编译和运行呢？
		// 分析程序一定要分析编译阶段的静态绑定和运行阶段的动态绑定。
		// 只有编译通过的代码才能运行。没有编译，根本轮不到运行。
		// 错误: 找不到符号
		// why??? 因为编译器只知道a2的类型是Animal，去Animal.class文件中找catchMouse()方法
		// 结果没有找到，所以静态绑定失败，编译报错。无法运行。（语法不合法。）
		//a2.catchMouse();


		// 假设代码写到了这里，我非要调用catchMouse()方法怎么办？
		// 这个时候就必须使用“向下转型”了。（强制类型转换）
		// 以下这行代码为啥没报错？？？？
		// 因为a5是Animal类型，转成Cat，Animal和Cat之间存在继承关系。所以没报错。
		Cat x = (Cat)a2;
		x.catchMouse();


		// 向下转型有风险吗？
		Animal a4 = new Bird() ;//表面上a6是一个Animal，运行的时候实际上是一只鸟儿。

		                                                                                                             
		
		/*
			分析以上程序，编译报错还是运行报错？？？
				编译器检测jo

				运行阶段，堆内存实际创建的对象是：Bird对象。
				在实际运行过程中，拿着Bird对象转换成Cat对象
				就不行了。因为Bird和Cat之间没有继承关系。
			
			运行是出现异常，这个异常和空指针异常一样非常重要，也非常经典：
				java.lang.ClassCastException：类型转换异常。
			
			java.lang.NullPointerException：空指针异常。这个也非常重要。
		*/
		// 怎么避免ClassCastException异常的发生？？？
		/*	
			新的内容，运算符：
				instanceof （运行阶段动态判断）
			第一：instanceof可以在运行阶段动态判断引用指向的对象的类型。
			第二：instanceof的语法：
				(引用 instanceof 类型)
			第三：instanceof运算符的运算结果只能是：true/false
			第四：c是一个引用，c变量保存了内存地址指向了堆中的对象。
				假设(c instanceof Cat)为true表示:
					c引用指向的堆内存中的java对象是一个Cat。
				假设(c instanceof Cat)为false表示:
					c引用指向的堆内存中的java对象不是一个Cat。
			
			程序员要养成一个好习惯：
				任何时候，任何地点，对类型进行向下转型时，一定要使用
				instanceof 运算符进行判断。（java规范中要求的。）
			
				这样可以很好的避免：ClassCastException
		*/


		System.out.println(a4 instanceof Cat);
		if(a4 instanceof Cat){
			Cat y = (Cat)a4;
			y.catchMouse();
		}
			

	}
}