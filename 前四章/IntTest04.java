public class IntTest04{
	public static void main(String[] args){
		long a=100L;
		int b=100;
		char c='a';
		short d=100;
		byte e=10;

		System.out.println(a+b+c+d+e);
		System.out.println(b+c+d+e);
		int x=(int)a+b+c+d+e;
		System.out.println(x);

	}

}