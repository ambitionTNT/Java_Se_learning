
/*
��ָ���쳣���µ���ʵ�ԭ���ǣ�
	�����÷� b�ʡ�ʵ����ص����ݡ�������ֿ�ָ���쳣��

	ʵ����صİ�����ʵ������ + ʵ��������

*/
public class NullPointerTest01{
	public static void main(String[] args){
		
		User u = new User();
		System.out.println(u.id); // 0
		u.doSome();
		// ���ñ�ɿ�null
		u = null;
		// id�ķ��ʣ���Ҫ����Ĵ��ڡ�
		System.out.println(u.id); // ��ָ���쳣

		// һ��ʵ�������ĵ���Ҳ�����ж���Ĵ��ڡ�
		u.doSome(); // ��ָ���쳣��

	}
}



class User{
	//ʵ������
	int id;
	// ʵ��������������صķ��������󼶱�ķ�����Ӧ����һ�����󼶱����Ϊ����
	// ����ģ����Ƕ������Ϊ������
	public void doSome(){
		System.out.println("do Some");
	}
	
	// �� = ���� + ����
	// ��������״̬
	// ����������Ϊ����


	// ���Ե���Ϊ������ÿһ���˿���֮��ķ�����һ�������Կ�����ΪӦ�ñ����ж���Ĳ��롣
	public void exam(){
		
	}
}