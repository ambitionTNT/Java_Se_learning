public class IfTest01{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��ӭʹ������ֵ�����");
		System.out.print("������һ���˵����䣺");
		int age =s.nextInt();

		if (age<0||age>150){
			System.out.println("������Ĳ��Ϸ���");
		}else if (age <= 5 ){
			System.out.println(age+"��"+"��Ӥ�׶�.");
		} else if (age<=10){
			System.out.println(age+"��"+"���ٶ�.");
		} else if (age<=18){
			System.out.println(age+"��"+"������.");
		} else if (age<=35){
			System.out.println(age+"��"+"������.");
		} else if (age<=55){
			System.out.println(age+"��"+"������.");
		} else {
			System.out.println(age+"��"+"������.");
		}


	}
}