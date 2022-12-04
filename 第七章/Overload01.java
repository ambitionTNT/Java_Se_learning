public class Overload01{
	public static void main(String[] args){
		System.out.println(sum(10,20));
		System.out.println(sum(10.2,9.5));
		System.out.println(sum(10L,11L));
	}

	public static int sum(int a,int b){
		System.out.println("int求和");
		return a + b;

	}
	
	public static double sum(double a,double b){
		System.out.println("double求和");
		return a+b;
	}
	public static long sum(long a,long b){
		System.out.println("long求和");
		return a+b;
	}

}
