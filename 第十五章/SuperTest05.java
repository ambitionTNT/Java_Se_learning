/*
	通过这个测试得出的结论：
		super 不是引用。super也不保存内存地址，super也不指向任何对象。
		super 只是代表当前对象内部的那一块父类型的特征。
*/

public class SuperTest05{
	
		// 实例方法
		public void doSome(){
			System.out.println(this);
			// 输出“引用”的时候，会自动调用引用的toString()方法。
			System.out.println(this.toString());
		//编译错误: 需要'.'
		//System.out.println(super);
		}
	// this和super不能使用在static静态方法中。
	/*
	public static void doOther(){
		System.out.println(this);
		System.out.println(super.xxx);
	}
	*/

	public static void main(String[] args){
		SuperTest05 s = new SuperTest05();
		s.doSome();
	}
}