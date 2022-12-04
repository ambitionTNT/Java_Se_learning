// 经过测试，你记住就行。
// 私有方法不能覆盖。
public class Override05{

	private void doSome(){
		System.out.println("OverrideTest05's private method doSome execute!");
	}
	public static void main(String[] argss){
		Override05 ot = new Override05();
		ot.doSome();
	}
}

/*
// 在外部类中无法访问私有的。
class MyMain{
	public static void main(String[] args){
		Override05 ot = new T();
		//错误: doSome() 在 OverrideTest06 中是 private 访问控制
		ot.doSome();
	}
}
*/
class T extends Override05{
	// 尝试重写父类中的doSome()方法
	// 访问权限不能更低，可以更高。
	public void doSome(){
		System.out.println("T's public doSome method execute!");
	}
}