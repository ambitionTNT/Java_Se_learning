public class ThisTest02{
	int i = 10;
	static int k =100;
	public static void main(String[] args){
		//��̬����
		ThisTest02 tt = new ThisTest02();
		System.out.println(tt.i);//����ʵ������������.
		System.out.println(ThisTest02.k);//���ʾ�̬����������.�ķ�����
		
		// ����. �ܲ���ʡ�ԣ�
		// ����
		System.out.println(k);
	}
}