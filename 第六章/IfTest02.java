public class IfTest02{
	public static void main(String[] args){
		//��������ɨ����
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("������ѧ�����Գɼ���");
		double grade = s.nextDouble();
		String str = "��";
		if (grade<0 || grade>100){
			System.out.println("���벻�Ϸ�!");
			return ;
		} else if (grade<60){
			str="������";
		} else if (grade<70){
			str="����";
		} else if (grade<80){
			str="��";
		} else if (grade<90){
			str = "��";
		}
		System.out.println("����ɼ���"+str+"!");
	
	


	}
}