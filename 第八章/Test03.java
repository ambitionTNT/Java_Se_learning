/*
	java�й��ڷ�������ʱ��������ʵ����ֻ��һ������
		�������ǻ����������ͣ����������������ͣ�ʵ�����ڴ��ݵ�ʱ����
		�������б�����Ǹ���ֵ������һ�ݣ�����ȥ��

		int x = 1;
		int y = x; ��x�б���1����һ�ݴ���y
		x��y���������ֲ�������

		Person p1 = 0x1234;
		Person p2 = p1; ��p1�б����0x1234����һ�ݴ���p2
		p1��p2���������ֲ�������

		�����ϱ����������Ҵ����ϵ�Կ�ף�Կ�������ѡ�
		���Ƕ����Դ���ҵĴ��š�

*/


public class Test03{
	public static void main(String[] args){
		Person p = new Person();
		p.i=10;
		add(p);
		System.out.println("main--->" + p.i); //11



	}
	public static void add(Person p){
		p.i++;
		System.out.println("main--->" + p.i); //11
	}

}

class Person{
	int i;
}