public class SuperTest01{
	public static void main(String[] args){
		new B();
	}
}

class A extends Object{
	// �����ֶ��Ľ�һ������޲������췽��д������
	public A(){
		super();//Ĭ�ϵ�super��������ʼ��Object��������
		System.out.println("A����޲ι��췽��ִ����");
	}
	// һ�������û���ֶ��ṩ�κι��췽����ϵͳ��Ĭ���ṩһ���޲������췽����
	// һ��������ֶ��ṩ��һ�����췽������ô�޲�������ϵͳ�������ṩ��
	public A(int a){
		System.out.println("A���вι��췽��ִ����");
	}

}
class B extends A{
	public B(){

		this("����");

		System.out.println("B����޲ι��췽��ִ���ˡ�");
	}
	public B(String name){
		super();
		System.out.println("B����вι��췽��ִ���ˡ�");
	}

}