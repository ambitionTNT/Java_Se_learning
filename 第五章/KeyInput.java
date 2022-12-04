public class KeyInput{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);

		
		System.out.print("请输入您的姓名：");
		String name = s.next();
		System.out.println('\n');
		System.out.println("欢迎"+ name +"使用小型计算器！");
		
		System.out.print("请输入第一个数字:");
		int num1=s.nextInt();

		System.out.print("请输入第一个数字:");
		int num2=s.nextInt();

		System.out.println(num1 + "+" + num2 + "="+ (num1 + num2));
		



	}
}