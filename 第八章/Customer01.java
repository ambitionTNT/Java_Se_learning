public class Customer01{
	public static void main(String[] args){
		Student s1 = new Student();
		// 输出“引用”
		//只要输出结果不是null，说明这个对象一定是创建完成了。
		// 此处的输出结果大家目前是看不懂的，后期再说。
		System.out.println(s1);
		//String name = "lisi";
		Student s2 = new Student("lisi");
		Student s3 = new Student(100);
	}

}