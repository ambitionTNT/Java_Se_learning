public class KeyInput{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);

		
		System.out.print("����������������");
		String name = s.next();
		System.out.println('\n');
		System.out.println("��ӭ"+ name +"ʹ��С�ͼ�������");
		
		System.out.print("�������һ������:");
		int num1=s.nextInt();

		System.out.print("�������һ������:");
		int num2=s.nextInt();

		System.out.println(num1 + "+" + num2 + "="+ (num1 + num2));
		



	}
}