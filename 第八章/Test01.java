public class Test01{

	
/*
	到目前为止，如果什么也没听懂，怎么写代码？
		记住一个知识点就行，可以后期慢慢学习画图。
			记住一句话：里面有什么就能“点”什么。

			所有的实例变量（属性）都是通过“引用.”来访问的。
	
	引用和对象怎么区分？
		“引用”是啥？是存储对象内存地址的一个变量。
		“对象”是啥？堆里new出来的。
	
	通俗一点：
		只要这个变量中保存的是一个对象的内存地址，那么这个变量就叫做“引用”。
	
	思考：
		引用一定是局部变量吗？
			不一定。
*/

	public static void main(String[] args){
		/*
			//这行代码将会报错，不能通过类名.的方式访问成员变量
			User u = new User();
			System.out.println(User.id);
		*/



		Address a = new Address();
		a.city = "成都";
		a.street = "成华大道";
		a.zipcode = "001111122";

		User u = new User();
		System.out.println(u.id);
		System.out.println(u.userName);
		System.out.println(u.addr);

		u.id = 1111;
		u.userName = "李四";
		u.addr = a;
		System.out.println(u.userName + "是"+u.addr.city+"城市的！");

		
		// u.addr.city 这行代码可否拆分呢？u.addr.city 节省变量。
		// 拆分成以下代码和以上效果完全相同，原理完全相同，不同的是以下代码多了两个变量。
		Address temp = u.addr;
		String temCity = temp.city;
		System.out.print(temCity);

		//-----------------------是否理解以下代码---------------------------
		int x = 100;
		// = 代表赋值运算，“赋值”中有一个“值”
		// x变量中的值是100. 将100复制一份给y
		// 表示：将x变量中保存的值100复制一份给y
		int y = x;
		
		//-----------------------是否理解以下代码---------------------------
		Address k = new Address(); // Address k = 0x1111;
		Address m = k; // 这里表示将k变量中保存的0x1111复制了一份传给了m变量。


		//java中只有传值。这里只是 把k这个引用存储的Address一对象地址复制给了m一份。



	}


}