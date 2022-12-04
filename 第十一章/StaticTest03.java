public class StaticTest03{
	public static void main(String[]  args){
	// 通过"类名."的方式访问静态变量

	System.out.println(Chinese.country);

	// 创建对象
	Chinese c1 = new Chinese("张三","122223123");
	System.out.println(c1.name);
	System.out.println(c1.idCard);
	System.out.println(c1.country);
	c1 = null;
// 分析这里会不会出现空指针异常？
// 分析这里会不会出现空指针异常？
// 不会出现空指针异常。
// 因为静态变量不需要对象的存在。是类级别的变量
// 实际上以下的代码在运行的时候，还是：System.out.println(Chinese.country);
	System.out.println(c1.country);
		// 这个会出现空指针异常，因为name是实例变量。需要new一个对象
	System.out.println(c1.name);//编译可以通过，但是运行时会出错。

	}
}




class Chinese{
	//实例变量
	String name;
	String idCard;

	//静态变量:中国
	static String country = "China";


	public Chinese(String _name,String _idCard){
		name = _name;
		idCard = _idCard;
		
	}

}