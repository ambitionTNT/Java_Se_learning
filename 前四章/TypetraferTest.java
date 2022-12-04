public class TypetraferTest{
	public static void main(String[] args){
		//错误 溢出 不兼容
		byte b1 = 1000;
		//可以
		byte b2 = 20;
		//可以
		short s = 1000;
		//可以
		int c = 1000;
		//可以，自动类型转换
		long d = c;
		//不可以，高转低 需要强制类型转换
		int e = d;
		//可以
		int f = 10 / 3;
		//可以，自动类型转换

		long g = 10;
		//不可以
		int h = g / 3;
		//可以
		long m = g / 3;
		//不可以，3是int ，need强转换
		byte x = (byte)g / 3;
		//可以，强转
		short y = (short)(g / 3);
		//可以
		short i = 10;
		//可以
		byte j = 5;
		//不可以,编译报错
		short k = i + j;
		//可以
		int n = i + j;
		//可以
		char cc = 'a';
		System.out.println("cc = " + cc);
		System.out.println((byte)cc);
		//可以
		int o = cc + 100;
		System.out.println(o);

	}

}