/*
	��ָ���쳣����NullPointerException��

	����������������GC
		��java�����У�������������Ҫ��Ե��Ƕ��ڴ档
		��һ��java����û���κ�����ָ��ö����ʱ��
		GC�ῼ�ǽ������������ͷŻ��յ���
	
	���ֿ�ָ���쳣��ǰ�������ǣ�
		"������"����ʵ����������ء���ص�����ʱ��������ֿ�ָ���쳣��
*/


public class NullPointer{
	public static void main(String[] args){
		
		Customer c = new Customer();
		System.out.println(c.id);

		c.id = 9527;
		System.out.println(c.id);


		c= null;
		// NullPointerException
		// ������û���⣬��Ϊ������ֻ����﷨������������c��Customer���ͣ�
		// Customer��������id���ԣ����Կ��ԣ�c.id���﷨���ˡ�
		// �������е�ʱ����Ҫ����Ĵ��ڣ����Ƕ���û�ˣ������ˣ���ֻ�ܳ���һ���쳣��
		System.out.println(c.id);


	}
}


class Customer{
	int id;
}