/*
	����Ĵ�����ʹ�á�
*/

public class StudentTest{
	public static void main(String[] args){

		//����ѧ����������ֱ��ͨ��������
		// ѧ��������һ��ʵ��������ʵ�������Ƕ��󼶱�ı�����
		// �ǲ���Ӧ�����ж������˵�������¶���
		// ����ͨ������������ֱ�ӷ��ʡ�ʵ����������
		//System.out.println(Student.name);

		Student s1 = new Student();
		System.out.println(s1.name);
		System.out.println(s1.stuId);
		System.out.println(s1.age);
		System.out.println(s1.sex);
		System.out.println(s1.addr);

		System.out.println("-----------------------------");

		Student s2 = new Student();
		System.out.println(s2.name);
		System.out.println(s2.stuId);
		System.out.println(s2.age);
		System.out.println(s2.sex);
		System.out.println(s2.addr);

	   System.out.println("-----------------------------");

		// ����ִ�е��˴��ҿ����޸�s1���ѧ����ѧ����
		// ͨ����=����ֵ�ķ�ʽ���ڴ���ʵ��������ֵ�޸�һ�¡�

		s1.name = "����";
		s1.stuId = 100;
		s1.age = 18;
		s1.sex = true;
		s1.addr = "�����д�����";




	
		System.out.println(s1.name);
		System.out.println(s1.stuId);
		System.out.println(s1.age);
		System.out.println(s1.sex);
		System.out.println(s1.addr);


	}
}