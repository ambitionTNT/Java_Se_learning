public class StaticTest05{
	public static void main(String[] args){
		User u1 = new User();
		System.out.println(u1.getId());
		User.printName2();
		u1.printName2();
	}
}

class T{
	int id;//ʵ������
}

class User{
	//ʵ����������Ҫ������ܷ���
	private int id;
	private String name;// �����ȷ������ǣ����name�Ƕ��󼶱�ģ�һ������һ�ݡ�
	//�����������Ӧ�ö���Ϊʵ���������Ǿ�̬�����أ�
	// ��ӡ�û�������������һ��������
	public void printName1(){
		System.out.println(name);
	}
	public static void printName2(){
		//System.out.println(name);
	}
	public void setId(int i){
		id = i;
	}

	public int getId(){
		return id;
	}
	
}
