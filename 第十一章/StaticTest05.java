public class StaticTest05{
	public static void main(String[] args){
		User u1 = new User();
		System.out.println(u1.getId());
		User.printName2();
		u1.printName2();
	}
}

class T{
	int id;//实例变量
}

class User{
	//实例变量，需要对象才能访问
	private int id;
	private String name;// 首先先分析的是，这个name是对象级别的，一个对象一份。
	//分析这个方法应该定义为实例方法还是静态方法呢？
	// 打印用户的名字这样的一个方法。
	public void printName1(){
		System.out.println(name);
	}
	public static void printName2(){
		//System.out.println(name);
	}
	public void setId(int i){
		id = i;
	}

	public int getId(){
		return id;
	}
	
}
