/*
	ʲôʱ������Ϊʵ���ģ�ʲôʱ������Ϊ��̬��
	���׼Ӳ���
*/

//����һ���ࣺ�й���
public class StaticTest02{
	public static void main(String[] args){
		Chinese c1 = new Chinese();
		System.out.println(c1.country);
		Chinese.country = "����";
		System.out.println(Chinese.country);
	}
}


class Chinese{
	//���֤�ţ�
	//ÿһ���˵����֤�Ų�ͬ���������֤��Ӧ����ʵ������
	//һ����һ�����֤��
	String idCard;
	//����
	//����Ҳ��һ����һ������,����ҲӦ����ʵ������
	String name;
	
	//����
	//���ڡ��й��ˡ��������˵���������ǡ��й������������Ŷ���ĸı���ı�
	//��Ȼ���������Ƕ��󼶱��������
	//��������������������������������
	//��������Ϊʵ���������ڴ�ͼ����
	//��̬���ڴ�ͼ����

   static String country = "�й�";

 
}