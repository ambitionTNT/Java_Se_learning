public class ThisTest02{
	int i = 10;
	static int k =100;
	public static void main(String[] args){
		//静态方法
		ThisTest02 tt = new ThisTest02();
		System.out.println(tt.i);//访问实例变量，引用.
		System.out.println(ThisTest02.k);//访问静态变量，类名.的方法。
		
		// 类名. 能不能省略？
		// 可以
		System.out.println(k);
	}
}