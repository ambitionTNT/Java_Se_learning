public class VerTest5{
	static int num=100;
	public static void main(String[] args){
		System.out.println(num);
		int num=200;
		System.out.println(num);
		m();
	}

	public static void m(){
		System.out.println(num);
	}
}