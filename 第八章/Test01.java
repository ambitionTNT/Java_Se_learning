public class Test01{

	
/*
	��ĿǰΪֹ�����ʲôҲû��������ôд���룿
		��סһ��֪ʶ����У����Ժ�������ѧϰ��ͼ��
			��סһ�仰��������ʲô���ܡ��㡱ʲô��

			���е�ʵ�����������ԣ�����ͨ��������.�������ʵġ�
	
	���úͶ�����ô���֣�
		�����á���ɶ���Ǵ洢�����ڴ��ַ��һ��������
		��������ɶ������new�����ġ�
	
	ͨ��һ�㣺
		ֻҪ��������б������һ��������ڴ��ַ����ô��������ͽ��������á���
	
	˼����
		����һ���Ǿֲ�������
			��һ����
*/

	public static void main(String[] args){
		/*
			//���д��뽫�ᱨ������ͨ������.�ķ�ʽ���ʳ�Ա����
			User u = new User();
			System.out.println(User.id);
		*/



		Address a = new Address();
		a.city = "�ɶ�";
		a.street = "�ɻ����";
		a.zipcode = "001111122";

		User u = new User();
		System.out.println(u.id);
		System.out.println(u.userName);
		System.out.println(u.addr);

		u.id = 1111;
		u.userName = "����";
		u.addr = a;
		System.out.println(u.userName + "��"+u.addr.city+"���еģ�");

		
		// u.addr.city ���д���ɷ����أ�u.addr.city ��ʡ������
		// ��ֳ����´��������Ч����ȫ��ͬ��ԭ����ȫ��ͬ����ͬ�������´����������������
		Address temp = u.addr;
		String temCity = temp.city;
		System.out.print(temCity);

		//-----------------------�Ƿ�������´���---------------------------
		int x = 100;
		// = ����ֵ���㣬����ֵ������һ����ֵ��
		// x�����е�ֵ��100. ��100����һ�ݸ�y
		// ��ʾ����x�����б����ֵ100����һ�ݸ�y
		int y = x;
		
		//-----------------------�Ƿ�������´���---------------------------
		Address k = new Address(); // Address k = 0x1111;
		Address m = k; // �����ʾ��k�����б����0x1111������һ�ݴ�����m������


		//java��ֻ�д�ֵ������ֻ�� ��k������ô洢��Addressһ�����ַ���Ƹ���mһ�ݡ�



	}


}