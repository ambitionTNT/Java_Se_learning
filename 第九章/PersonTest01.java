// ���ⲿ�����з���Person��������е����ݡ�
public class PersonTest01{
	public static void main(String[] args){
		// ����Person����
		Person p1 = new Person();
		// �����˵�����
		// ����һ����������ԣ�ͨ���������ֲ�����һ���Ƕ����ݣ�һ���Ǹ����ݡ�
		// ������
		System.out.println(p1.getAge());
		p1.setAge(10);
		System.out.println(p1.getAge());


		// ��PersonTest����ⲿ������Ŀǰ�ǿ��������age���Խ��в����ġ�
		// һ���˵�����ֵ��Ӧ��Ϊ������
		// �����и����丳ֵ��һ����������˵�ǲ�����ҵ��Ҫ��ģ����ǳ���Ŀǰ��������ͨ���ˡ�
		// ��ʵ�����һ�������bug��
		p1.setAge(-100);
		System.out.println(p1.getAge());



	}
}