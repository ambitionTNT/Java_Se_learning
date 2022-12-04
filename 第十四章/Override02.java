
//方法覆盖比较经典的案例
//一定要注意：方法覆盖/重写的时候，建议将父类的方法复制粘贴，这样比较保险。
public class Override02{
	public static void main(String[] args){
		//Chinese c1 = new Chinese("张三 ");//这样会错误，因继承不会继承构造方法。
		  Chinese c1 =new Chinese();
		  c1.setName("张三");
		  c1.speak();	
		  American a2 = new American();
		  a2.setName("jack");
		  a2.speak();

	}
}


class People{
	private String name;
	public void People(){}
	public void People(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void speak(){
		System.out.println(name + "....");
	}

}

class Chinese extends People{
	// 中国人说话是汉语
	// 所以子类需要对父类的speak()方法进行重写
	public void speak(){
		System.out.println(getName() + "说普通话");
	}
}

class American extends People{
	public void speak(){
		System.out.println(getName() + "说English");
	}
}