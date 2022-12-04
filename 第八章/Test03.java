/*
	java中关于方法调用时参数传递实际上只有一个规则：
		不管你是基本数据类型，还是引用数据类型，实际上在传递的时候都是
		将变量中保存的那个“值”复制一份，传过去。

		int x = 1;
		int y = x; 把x中保存1复制一份传给y
		x和y都是两个局部变量。

		Person p1 = 0x1234;
		Person p2 = p1; 把p1中保存的0x1234复制一份传给p2
		p1和p2都是两个局部变量。

		你和你媳妇，都有你家大门上的钥匙，钥匙是两把。
		但是都可以打开你家的大门。

*/


public class Test03{
	public static void main(String[] args){
		Person p = new Person();
		p.i=10;
		add(p);
		System.out.println("main--->" + p.i); //11



	}
	public static void add(Person p){
		p.i++;
		System.out.println("main--->" + p.i); //11
	}

}

class Person{
	int i;
}