public class ExtendsTest03{
	public static void main(String[] args){
		Cat c = new Cat();
		c.move();
		// ͨ������������name������
		System.out.println(c.name);

	}
}
/*
���ԣ�����̳и���֮����ʹ�����������ø��෽����
	ʵ�������ϵ���������ʵ��е����Σ���������
	�������Σ�����ʹ�����������ø��෽����
	�����ϣ�����̳и���֮���ǽ�����̳й����ķ�����Ϊ�Լ����С�
	ʵ���ϵ��õ�Ҳ���Ǹ���ķ��������������Լ��ķ�������Ϊ�Ѿ��̳й�����
	�������Լ��ġ�����
		
*/
class Animal{
	String name = "С��";
	public void move(){
		System.out.println(this.name +"�����ƶ�");
	}

}

class Cat extends Animal{
}