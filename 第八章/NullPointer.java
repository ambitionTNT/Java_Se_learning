/*
	空指针异常。（NullPointerException）

	关于垃圾回收器：GC
		在java语言中，垃圾回收器主要针对的是堆内存。
		当一个java对象没有任何引用指向该对象的时候，
		GC会考虑将该垃圾数据释放回收掉。
	
	出现空指针异常的前提条件是？
		"空引用"访问实例【对象相关】相关的数据时，都会出现空指针异常。
*/


public class NullPointer{
	public static void main(String[] args){
		
		Customer c = new Customer();
		System.out.println(c.id);

		c.id = 9527;
		System.out.println(c.id);


		c= null;
		// NullPointerException
		// 编译器没问题，因为编译器只检查语法，编译器发现c是Customer类型，
		// Customer类型中有id属性，所以可以：c.id。语法过了。
		// 但是运行的时候需要对象的存在，但是对象没了，尴尬了，就只能出现一个异常。
		System.out.println(c.id);


	}
}


class Customer{
	int id;
}