public class ThisTest01{
	public static void main(String[] args){
		Customer c1 = new Customer();
		Customer c2 = new Customer("lisi");

		c1.shopping();
		c2.shopping();
		c1.doSome();
		
	}
}

class Customer{
	String name;
	//���췽��

	public Customer(){

		
	}

	public Customer(String s){
		name = s;
	}
	//�˿͹���ķ���
	//ʵ������
	
	public void shopping(){
		// �����this��˭��this�ǵ�ǰ����
		// c1����shopping(),this��c1
		// c2����shopping(),this��c2
		//System.out.println(this.name + "���ڹ���!");

		// this. �ǿ���ʡ�Եġ�
		// this. ʡ�ԵĻ�������Ĭ�Ϸ��ʡ���ǰ���󡱵�name��
		System.out.println(name +"���ڹ���");
		System.out.println(this.name+"���ڹ���");
	}

	public static void doSome(){
		//System.out.println(this);
	}


}
class Student{


}
