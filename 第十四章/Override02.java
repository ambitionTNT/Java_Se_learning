
//�������ǱȽϾ���İ���
//һ��Ҫע�⣺��������/��д��ʱ�򣬽��齫����ķ�������ճ���������Ƚϱ��ա�
public class Override02{
	public static void main(String[] args){
		//Chinese c1 = new Chinese("���� ");//�����������̳в���̳й��췽����
		  Chinese c1 =new Chinese();
		  c1.setName("����");
		  c1.speak();	
		  American a2 = new American();
		  a2.setName("jack");
		  a2.speak();

	}
}


class People{
	private String name;
	public void People(){}
	public void People(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void speak(){
		System.out.println(name + "....");
	}

}

class Chinese extends People{
	// �й���˵���Ǻ���
	// ����������Ҫ�Ը����speak()����������д
	public void speak(){
		System.out.println(getName() + "˵��ͨ��");
	}
}

class American extends People{
	public void speak(){
		System.out.println(getName() + "˵English");
	}
}