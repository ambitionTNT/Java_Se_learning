public class TypetraferTest{
	public static void main(String[] args){
		//���� ��� ������
		byte b1 = 1000;
		//����
		byte b2 = 20;
		//����
		short s = 1000;
		//����
		int c = 1000;
		//���ԣ��Զ�����ת��
		long d = c;
		//�����ԣ���ת�� ��Ҫǿ������ת��
		int e = d;
		//����
		int f = 10 / 3;
		//���ԣ��Զ�����ת��

		long g = 10;
		//������
		int h = g / 3;
		//����
		long m = g / 3;
		//�����ԣ�3��int ��needǿת��
		byte x = (byte)g / 3;
		//���ԣ�ǿת
		short y = (short)(g / 3);
		//����
		short i = 10;
		//����
		byte j = 5;
		//������,���뱨��
		short k = i + j;
		//����
		int n = i + j;
		//����
		char cc = 'a';
		System.out.println("cc = " + cc);
		System.out.println((byte)cc);
		//����
		int o = cc + 100;
		System.out.println(o);

	}

}