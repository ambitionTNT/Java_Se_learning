public class Overload02{
	public static void main(String[] args){
		m();
		m(10);
		m(10,10);
		m(19.0,10.0);
		m(10.0,10);
		m(10,10.0);
		Test01.m(10);
	}

	public static void m(){
	
		System.out.println("无参m()");

	}

	public static void m(int a){
		System.out.println("一个int参数m()");
	}

	public static void m(int a,int b){
		System.out.println("两个int参数m()");
	}

	public static void m(double a,double b){
		System.out.println("两个double参数m()");
	}

	public static void m(double a,int b){
		System.out.println("一个double 一个int");

	}
	public static void m(int a,double b){
		System.out.println("一个int，一个double");
	}

}


class Test01{
		public static void m(int a){
		System.out.println("一个int参数m()");
	}

}