public class ThisTest04{
	public static void main(String[] args){
		Date d1 = new Date();
		d1.detail();

				// �����в������췽��
		Date d2 = new Date(2008, 8, 8);
		d2.detail();
	}
}

/*
����
	1������һ�������࣬���Ա�ʾ��������Ϣ��
	2��������Ҫ��
		��������޲������췽����Ĭ�ϴ���������Ϊ��1970��1��1�ա�
		��Ȼ�����˵����޲������췽��֮�⣬Ҳ���Ե����в����Ĺ��췽�����������ڶ���
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


		// �ṩһ�����Դ�ӡ���ڵķ���
	public void detail(){
		//System.out.println(year + "��" + month + "��" + day + "��");
		System.out.println(this.year + "��" + this.month + "��" + this.day + "��");
	}
}