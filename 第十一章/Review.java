/*
	��ĿǰΪֹһ���൱�п��Գ��ֵģ�
		����{
			ʵ������;
			ʵ������;

			��̬����;
			��̬����;

			���췽��;

			��̬�����;
			ʵ������;

			����(){
				// �ֲ�����
				int i = 100;
			}
		}
*/


public class Review{
	// ����ػ����У��������ģ��ڳ���ִ��֮ǰ��������Ҫ���ص���ȫ�����ص�JVM���С�
	// ����ɼ��زŻ�ִ��main������
	static{
		System.out.println("Review�����ʱִ�У�");
	}
	public static void main(String[] args){
		int i = 100;
		Student s1 = new Student("����","10001");
		s1.study();

	}
}


class Student{
	static{
		System.out.println("static����� ������ص�ʱ��ִ��");
	}

	private String name;
	private String id;
	static String job = "ѧ��";
	public Student(){
		
	}

	public Student(String name,String id){
		this.name = name;
		this.name = id;
	}

	{
		System.out.println("ʵ�����飬���췽��ִ��һ�Σ������ִ��һ�Σ�");
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}

	public void study(){
		// ˽�е��ǿ����ڱ����з��ʵġ����������б���ʹ��set��get������
		//System.out.println(this.name + "����Ŭ����ѧϰ!");
		//System.out.println(name + "����Ŭ����ѧϰ!");
		System.out.println(this.getName()+"����Ŭ����ѧϰ.");
		//System.out.println(getName() + "����Ŭ����ѧϰ!");
		
		
		// ����ִ�е��˴���ʾѧϰ����ˣ�ȥ�Է���
		//this.eat();		
		// this.����ʡ��
		// ��������⵽eat()������ʵ�����������Զ���eat()����ǰ��� this.
		eat();

	}
	public void eat(){
		System.out.println(this.getName() + "�ڲ����Է��أ�����");
		
		// ���þ�̬m1()����
		// ��̬����ʹ�á�����.���ķ�ʽ����
		// Student.m1();
		m1();
		// ����. ����ʡ���𣿿��ԡ�
		// java���������Զ���m1()����֮ǰ��ӡ�����.������Ϊ��⵽m1()������һ����̬������

	}

	public static void m1(){
		System.out.println("Student's m1 method execute!");
		// ����m2()����
		//Student.m2();
		m2();
	}
	public static void m2(){
		System.out.println("Student's m2 method execute!");
		System.out.println("�������ʣ�" + job);
		// ��������⵽job��һ����̬����������������Զ���jobǰ��ӣ�Student.
		//System.out.println("�������ʣ�" + Student.job);
	}


}