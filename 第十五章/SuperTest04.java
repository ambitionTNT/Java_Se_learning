
/*
	1����this.���͡�super.���󲿷�����¶��ǿ���ʡ�Եġ�
	2��this. ʲôʱ����ʡ�ԣ�
		public void setName(String name){
			this.name = name;
		}
	3��super. ʲôʱ����ʡ�ԣ�
		�����У��������У�����������з��ʡ�������������super. ����ʡ�ԡ�
*/
public class SuperTest04{
	public static void main(String[] args){
		Vip v = new Vip("����");
		v.shopping();
	}
}

class Customer{
	String name;
	public Customer(){}
	public Customer(String name){
		super();
		this.name = name;
	}

	public void doSome(){
	
		System.out.println(this.name+"do some");
		System.out.println(name);
	
	}
}


class Vip extends Customer{
	// ��������Ҳ��һ��ͬ������
	// java�������������г��ֺ͸���һ����ͬ������/ͬ�����ԡ�
	String name;
	public Vip(){}
	public Vip(String name){
		super(name);
		
	}
	// super��this�����ܳ����ھ�̬�����С�
	public void shopping(){
		// this��ʾ��ǰ����
		System.out.println(this.name + "���ڹ���!");
		// super��ʾ���ǵ�ǰ����ĸ�������������super��thisָ����Ǹ������е�һ��ռ䡣��
		System.out.println(super.name + "���ڹ���!");
		System.out.println(name + "���ڹ���!");
	}
}