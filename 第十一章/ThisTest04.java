public class ThisTest04{
	public static void main(String[] args){
		Date d1 = new Date();
		d1.detail();

				// 调用有参数构造方法
		Date d2 = new Date(2008, 8, 8);
		d2.detail();
	}
}

/*
需求：
	1、定义一个日期类，可以表示年月日信息。
	2、需求中要求：
		如果调用无参数构造方法，默认创建的日期为：1970年1月1日。
		当然，除了调用无参数构造方法之外，也可以调用有参数的构造方法来创建日期对象。
*/

class Date{
	private int year;
	private int month;
	private int day;
	public Date(){
		this(1970,1,1);
		
	}

	public Date(int year ,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return this.year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return this.month ;
	}
	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return this.day;
	}


		// 提供一个可以打印日期的方法
	public void detail(){
		//System.out.println(year + "年" + month + "月" + day + "日");
		System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
	}
}