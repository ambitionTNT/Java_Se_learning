
/*
	��ǰ������ڵ����⣨����ϵ����⣩��������
		�����ִ��move()������ʱ���������Ľ���ǣ�������ڷ��衱
		���ǵ�ǰ�ĳ�����ִ��move()������ʱ������Ľ���ǣ�"�������ƶ���"
		����ȻBird�����Animal�����м̳й�����move()�����Ѿ��޷����������ҵ������

*/

public class Override01{
	public static void main(String[] args){
		Cat c = new Cat();
		c.move();
		Bird b = new Bird();
		b.move();
		b.sing(10000);

	}
}

class Animal{
	public void move(){
		System.out.println("�������ƶ�");
	}
	public void sing(int i){
		System.out.println("animal is singing");
	}
}

class Cat extends Animal{
	// è���ƶ���ʱ����ϣ�������è����è��������������
	public void move(){
		System.out.println("CAT����è��");
	}
}

class Bird extends Animal{// ����̳и����У���һЩ����Ϊ�����ܲ���Ҫ�Ľ�����һЩ����Ϊ�����������ű���Ľ���
	// ��Ϊ�����м̳й����ķ����Ѿ��޷����������ҵ������

	// ������ƶ���ʱ��ϣ���������ڷ��裡������
	// ��move�������з������ǣ�������д��override
	// ��ý������еķ���ԭ�ⲻ���ĸ��ƹ��������������ֶ���д��
	// �������ǣ����ǽ��̳й������Ǹ����������ǵ��ˡ��̳й����ķ���û�ˡ�
	/*
	public void move(){
		System.out.println("С���ڷ���");

	}
	*/

	// ���������sing()�͸����е�sing(int i)��û�й��ɷ��������أ�
	// û�У�ԭ���ǣ�������������������������ȫ��ͬ�ķ�����
	// ����˵���������������˷��������𣿿��ԡ�
	public void sing(){
		System.out.println("Bird sing.....");
	}
	//protected��ʾ�ܱ����ġ�û��public���š�
	// �������ڳ��Է�����͵ķ���Ȩ��; ��ǰΪpublic
	/*
	protected void move(){
		System.out.println("����ڷ��裡����");
	}
	*/

		//���󣺱����ǵķ���δ�׳�Exception
	/*
	public void move() throws Exception{
		System.out.println("����ڷ��裡����");
	}
	*/
}