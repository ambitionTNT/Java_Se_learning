public class MethodTest02{
	public static void main(String[] args){
		int result = m();
		System.out.println(result);

	}


	public static int m(){
		boolean flag = true; //���������������г��򣬱�����ֻ������
		// ���ڱ�������˵��������ֻ֪��flag������boolean����
		// ����������Ϊflag�п�����false���п�����true
		if(flag){
			// ���������ã��������д�����ܻ�ִ�У���ȻҲ���ܲ���ִ��
			// ������Ϊ��ȷ�����򲻳����κ��쳣�����Ա�����˵��ȱ�ٷ������
			return 1;
			System.out.println("hello");
		}else{
			return 0;
		}

	}
}