public class OperatorTest01{
	public static void main(String[] args){
		int a=10;
		int b=20;
		System.out.println(a+b);//30
		System.out.println(a-b);//-10
		System.out.println(a*b);//200
		System.out.println(a/b);//0
		//System.out.println(a\b);//2
		System.out.println(a%b);//10

		int i=10;
		System.out.println(i++);//10
		System.out.println(++i);//12
		System.out.println(i--);//12
		System.out.println(--i);//10
		System.out.println("__________________________________");
		System.out.println(a>=b);//false
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a<b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true


		System.out.println("__________________________________");
		
		
		/*
		System.out.println(100&true);//true
		System.out.println(100&200);//true
		System.out.println(true&false);//true
		*/
		System.out.println(true&true);//true
		System.out.println(true&false);//false
		System.out.println((100>90)&(100>101));//false
		int c=9;
		System.out.println(a<b&a>c);//true 
		

		System.out.println(a>b|a<c);//flase;
		System.out.println(a<b|a<c);//true;
		System.out.println(!(a>b));//true


		System.out.println("__________________________________");
		
		int x=10;
		int y=12;


		System.out.println((x > y)&&(x < y++));//false
		System.out.println(y);//12
		System.out.println((x > y)&(x < y++));//false
		System.out.println(y);//13

		System.out.println((x < y)||(x < y++));//false
		System.out.println(y);//13
		System.out.println((x < y)|(x < y++));//false
		System.out.println(y);//14

		System.out.println("__________________________________");


		byte z=100;
		z+=100;
		System.out.println(z);




		int iw=100;
		boolean sex=true;

		char r = sex? '男':'女';
		System.out.println(r);
		System.out.println("__________________________________");

		int age =10;
		System.out.println("年龄="+age);
		String name="张三";
		System.out.println("")

	}
}