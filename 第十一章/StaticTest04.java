public class StaticTest04{
	public static void main(String[] args){
		StaticTest04.doSome();
		StaticTest04 st = new StaticTest04();
		st.doOther();
		st.doSome();
		st = null ;
		//st.doOther();
		st.doSome();

	}

	// ��̬��������̬��������Ҫnew����ֱ��ʹ�á�����.�������ʣ�
	// ����Ҳ����ʹ�á�����.�������ʣ��������á�����Ϊ��������Ա��е����󡣣�
	public static void doSome(){
		System.out.println("��̬����dosome");
	}
	public void doOther(){
		System.out.println("ʵ������doOther");
	}

// �ӵ�һ�쿪ʼ����HelloWorld��ĿǰΪֹ��һ���൱��һ����д����Щ������
/*
	��{
		ʵ����صģ�����Ҫnew����ģ�ͨ������.����.
		ʵ������
		ʵ������
		��̬��صģ����ǲ��� ����.�������ʡ���Ҳ���Բ��ã�����. �������� ����ת��Ϊ�����.
		��̬������
		��̬������
	}




*/


}