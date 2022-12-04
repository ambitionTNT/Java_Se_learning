public class Switch03{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("请输入成绩：");
		double score = s.nextDouble();
		if(score<0||score>100){
			System.out.println("您输入的有误！");
			return ;
		}

		int grade = (int)(score/10);
		String str;
		switch (grade)
		{
		case 10: case 9:
			str="优";
			break;
		case 8:
			str="良";
			break;
		case 7:
			str="中";
			break;
		case 6:
			str="及格";
			break;
		default:
			str="不及格";
		
		}
		System.out.println(str);

	}
}