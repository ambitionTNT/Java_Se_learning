// �������ԣ����ס���С�
// ˽�з������ܸ��ǡ�
public class Override05{

	private void doSome(){
		System.out.println("OverrideTest05's private method doSome execute!");
	}
	public static void main(String[] argss){
		Override05 ot = new Override05();
		ot.doSome();
	}
}

/*
// ���ⲿ�����޷�����˽�еġ�
class MyMain{
	public static void main(String[] args){
		Override05 ot = new T();
		//����: doSome() �� OverrideTest06 ���� private ���ʿ���
		ot.doSome();
	}
}
*/
class T extends Override05{
	// ������д�����е�doSome()����
	// ����Ȩ�޲��ܸ��ͣ����Ը��ߡ�
	public void doSome(){
		System.out.println("T's public doSome method execute!");
	}
}