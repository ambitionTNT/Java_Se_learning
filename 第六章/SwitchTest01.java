public class SwitchTest01{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������[0~6]������: ");
		int date = s.nextInt();
		String str;
		switch(date){
		case 0:case 7: 
			str="������";
			break;
		case 1:
			str="����һ";
			break;
		case 2:
			str="���ڶ�";
			break;
		case 3:
			str="������";
			break;
		case 4:
			str="������";
			break;
		case 5:
			str="������";
			break;
		case 6:
			str="������";
			break;
		default:
			str="������Ĳ��Ϸ���";
		}
		System.out.println(str);
	}

}