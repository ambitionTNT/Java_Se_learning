/*
	�����������ʣ�
		���ۿ��Թ۲쵽�ײ㵽����new Bird()����new Cat()����
		����Ϊʲô��Ҫ����instanceof���ж��أ�������

		ԭ���ǣ�
			���Ժ�������ۿ�������
*/

public class Test02{
	public static void main(String[] args){
		Animal x = new Cat();
		Animal y = new Bird();
		if(x instanceof Cat){
			Cat c = (Cat)x;
			c.catchMouse();
		}else if(x instanceof Bird){
			Bird b = (Bird)x;
			b.sing();
		}

		if(y instanceof Cat){
			Cat c1 = (Cat)y;
			c1.catchMouse();
		}else if(y instanceof Bird){
			Bird b = (Bird)y;
			b.sing();
		}

	}
}