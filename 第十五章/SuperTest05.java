/*
	ͨ��������Եó��Ľ��ۣ�
		super �������á�superҲ�������ڴ��ַ��superҲ��ָ���κζ���
		super ֻ�Ǵ���ǰ�����ڲ�����һ�鸸���͵�������
*/

public class SuperTest05{
	
		// ʵ������
		public void doSome(){
			System.out.println(this);
			// ��������á���ʱ�򣬻��Զ��������õ�toString()������
			System.out.println(this.toString());
		//�������: ��Ҫ'.'
		//System.out.println(super);
		}
	// this��super����ʹ����static��̬�����С�
	/*
	public static void doOther(){
		System.out.println(this);
		System.out.println(super.xxx);
	}
	*/

	public static void main(String[] args){
		SuperTest05 s = new SuperTest05();
		s.doSome();
	}
}