public class IfTest03{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.print("请输入天气情况：");
		int weather = s.nextInt();
		
		System.out.print("请输入请别:");
		int sex = s.nextInt();

		if(weather==1){
			if(sex == 1){
				System.out.println("请打一把大黑伞！");
			}else{
				System.out.println("请打一把大花伞! ");
			}
		}else{
			if(sex == 1){
				System.out.println("直接走起，出去玩！");
			}else{
				System.out.println("擦点防晒爽，出去玩耍! ");
			}
		}



		 
				
	}
}