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
	
		System.out.println("�޲�m()");

	}

	public static void m(int a){
		System.out.println("һ��int����m()");
	}

	public static void m(int a,int b){
		System.out.println("����int����m()");
	}

	public static void m(double a,double b){
		System.out.println("����double����m()");
	}

	public static void m(double a,int b){
		System.out.println("һ��double һ��int");

	}
	public static void m(int a,double b){
		System.out.println("һ��int��һ��double");
	}

}


class Test01{
		public static void m(int a){
		System.out.println("һ��int����m()");
	}

}