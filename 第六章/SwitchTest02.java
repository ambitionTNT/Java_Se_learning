public class SwitchTest02{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("���������������1��ʾ���죬0��ʾ���죩: ");
		String weather = s.next();
		System.out.print("�������Ա������1��ʾ�У�0��ʾŮ��: ");
		String sex=s.next();
		switch(weather+sex){
		case "00":
			System.out.println("�����ɹ˪����ȥ��ˣ!");
			break;
		case "01":
			System.out.println("ֱ�����𣬳�ȥ��ˣ!");
			break;
		case "10":
			System.out.println("��һ��С��ɡ!");
			break;
		case "11":
			System.out.println("��һ�Ѵ��ɡ!");
			break;
		default:
			System.out.println("�����������!");
		}

	}

}