public class SwitchTest02{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("请输入天气情况（1表示晴天，0表示雨天）: ");
		String weather = s.next();
		System.out.print("请输入性别情况（1表示男，0表示女）: ");
		String sex=s.next();
		switch(weather+sex){
		case "00":
			System.out.println("擦点防晒霜，出去玩耍!");
			break;
		case "01":
			System.out.println("直接走起，出去玩耍!");
			break;
		case "10":
			System.out.println("打一把小花伞!");
			break;
		case "11":
			System.out.println("打一把大黑伞!");
			break;
		default:
			System.out.println("您输入的有误!");
		}

	}

}