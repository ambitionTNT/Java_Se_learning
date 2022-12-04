public class IfTest01{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("欢迎使用年龄分档器！");
		System.out.print("请输入一个人的年龄：");
		int age =s.nextInt();

		if (age<0||age>150){
			System.out.println("您输入的不合法！");
		}else if (age <= 5 ){
			System.out.println(age+"岁"+"是婴幼儿.");
		} else if (age<=10){
			System.out.println(age+"岁"+"是少儿.");
		} else if (age<=18){
			System.out.println(age+"岁"+"是少年.");
		} else if (age<=35){
			System.out.println(age+"岁"+"是青年.");
		} else if (age<=55){
			System.out.println(age+"岁"+"是中年.");
		} else {
			System.out.println(age+"岁"+"是老年.");
		}


	}
}