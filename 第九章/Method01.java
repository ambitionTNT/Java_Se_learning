//����static�ķ���
//û��static�ķ���
//�ֱ���ô���ã�
//����static�ķ�����ô���ã�ͨ��������.���ķ�ʽ���ʡ�


//���󱻳�Ϊʵ����
//ʵ����ص��У�ʵ��������ʵ��������
//ʵ�������Ƕ��������ʵ�������Ƕ��󷽷���
//ʵ����صĶ���Ҫ��new����ͨ��������.���ķ�ʽȥ���ʡ�
public class Method01{
	/*
	public MethodTest(){
	
	}
	*/
	public static void main(String[] args){

		Method01 m1 = new Method01();
		Method01.doSome();
		m1.doOther();
		
	}
	//����static
	public static void doSome(){
		System.out.println("do some!");
	}

	//�������û��static�������ķ�������Ϊ��ʵ��������
	//�� ���󷽷������󼶱�ķ�����
	//���û�����ͣ����Ŀǰ����Ӳ����
	public void doOther(){
		System.out.println("do other!");
	}
}