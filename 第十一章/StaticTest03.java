public class StaticTest03{
	public static void main(String[]  args){
	// ͨ��"����."�ķ�ʽ���ʾ�̬����

	System.out.println(Chinese.country);

	// ��������
	Chinese c1 = new Chinese("����","122223123");
	System.out.println(c1.name);
	System.out.println(c1.idCard);
	System.out.println(c1.country);
	c1 = null;
// ��������᲻����ֿ�ָ���쳣��
// ��������᲻����ֿ�ָ���쳣��
// ������ֿ�ָ���쳣��
// ��Ϊ��̬��������Ҫ����Ĵ��ڡ����༶��ı���
// ʵ�������µĴ��������е�ʱ�򣬻��ǣ�System.out.println(Chinese.country);
	System.out.println(c1.country);
		// �������ֿ�ָ���쳣����Ϊname��ʵ����������Ҫnewһ������
	System.out.println(c1.name);//�������ͨ������������ʱ�����

	}
}




class Chinese{
	//ʵ������
	String name;
	String idCard;

	//��̬����:�й�
	static String country = "China";


	public Chinese(String _name,String _idCard){
		name = _name;
		idCard = _idCard;
		
	}

}