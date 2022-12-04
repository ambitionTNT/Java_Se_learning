/*
	这个代码的疑问？
		肉眼可以观察到底层到底是new Bird()还是new Cat()！！
		我们为什么还要进行instanceof的判断呢！！！！

		原因是：
			你以后可能肉眼看不到。
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