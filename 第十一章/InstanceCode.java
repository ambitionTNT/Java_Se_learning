public class InstanceCode{
	public static void main(String[] args){
		

		System.out.println("main begin");
		new InstanceCode();
		new InstanceCode();

		new InstanceCode("abc");
		new InstanceCode("xyz");
	}

	public InstanceCode(){
		System.out.println("A");
	}
	
	public InstanceCode(String name){
		System.out.println("B");
	}


	{
		System.out.println("hello£º");
	}

	// ¾²Ì¬´úÂë¿é
	static
	{
		System.out.println("D");
	}

}