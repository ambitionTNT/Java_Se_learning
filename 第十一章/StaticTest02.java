/*
	什么时候声明为实例的，什么时候声明为静态的
	到底加不加
*/

//定义一个类：中国人
public class StaticTest02{
	public static void main(String[] args){
		Chinese c1 = new Chinese();
		System.out.println(c1.country);
		Chinese.country = "美国";
		System.out.println(Chinese.country);
	}
}


class Chinese{
	//身份证号：
	//每一个人的身份证号不同，所以身份证号应该是实例变量
	//一个人一个身份证号
	String idCard;
	//姓名
	//姓名也是一个人一个名字,姓名也应该是实例变量
	String name;
	
	//国籍
	//对于“中国人”这个类来说，国籍都是“中国”，不会随着对象的改变而改变
	//显然国籍并不是对象级别的特征。
	//国籍属于整个类的特征。整个族的特征
	//假设声明为实例变量，内存图？？
	//静态，内存图？？

   static String country = "中国";

 
}