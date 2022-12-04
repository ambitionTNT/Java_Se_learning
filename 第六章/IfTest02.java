public class IfTest02{
	public static void main(String[] args){
		//创建键盘扫描器
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入学生考试成绩：");
		double grade = s.nextDouble();
		String str = "优";
		if (grade<0 || grade>100){
			System.out.println("输入不合法!");
			return ;
		} else if (grade<60){
			str="不及格";
		} else if (grade<70){
			str="及格";
		} else if (grade<80){
			str="中";
		} else if (grade<90){
			str = "良";
		}
		System.out.println("这个成绩是"+str+"!");
	
	


	}
}