public class Switch03{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("������ɼ���");
		double score = s.nextDouble();
		if(score<0||score>100){
			System.out.println("�����������");
			return ;
		}

		int grade = (int)(score/10);
		String str;
		switch (grade)
		{
		case 10: case 9:
			str="��";
			break;
		case 8:
			str="��";
			break;
		case 7:
			str="��";
			break;
		case 6:
			str="����";
			break;
		default:
			str="������";
		
		}
		System.out.println(str);

	}
}