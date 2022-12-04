public class SwitchTest01{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入[0~6]的数字: ");
		int date = s.nextInt();
		String str;
		switch(date){
		case 0:case 7: 
			str="星期日";
			break;
		case 1:
			str="星期一";
			break;
		case 2:
			str="星期二";
			break;
		case 3:
			str="星期三";
			break;
		case 4:
			str="星期四";
			break;
		case 5:
			str="星期五";
			break;
		case 6:
			str="星期六";
			break;
		default:
			str="您输入的不合法！";
		}
		System.out.println(str);
	}

}