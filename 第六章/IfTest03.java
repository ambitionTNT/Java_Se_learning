public class IfTest03{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.print("���������������");
		int weather = s.nextInt();
		
		System.out.print("���������:");
		int sex = s.nextInt();

		if(weather==1){
			if(sex == 1){
				System.out.println("���һ�Ѵ��ɡ��");
			}else{
				System.out.println("���һ�Ѵ�ɡ! ");
			}
		}else{
			if(sex == 1){
				System.out.println("ֱ�����𣬳�ȥ�棡");
			}else{
				System.out.println("�����ɹˬ����ȥ��ˣ! ");
			}
		}



		 
				
	}
}