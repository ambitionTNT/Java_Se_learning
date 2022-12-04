// 使用继承机制来解决代码复用问题。
// 继承也是存在缺点的：耦合度高，父类修改，子类受牵连。
public class ExtendsTest01{
	public static void main(String[] args){
		// 创建普通账户
		Account a1 = new Account("10001",10000);
		System.out.println("账号:"+a1.getActno()+"余额："+a1.getBalance());

		CreditAccount ca1 = new CreditAccount();
		ca1.setActno("10002");
		ca1.setBalance(-110020);
		ca1.setCredit(98);
		System.out.println(ca1.getActno() + ",余额" + ca1.getBalance() + ",信誉度" + ca1.getCredit());
	}
}


// 银行账户类
// 账户的属性：账号、余额
class Account{
	private String actno;
	private double balance;
	public Account(){}
	public Account(String actno,double balance){
		this.actno = actno;
		this.balance = balance;
	}
	public void setActno(String actno){
		this.actno = actno;
	}
	public String getActno(){
		return  this.actno;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}



}
// 其它类型的账户：信用卡账户
// 账号、余额、信誉度

class CreditAccount extends Account{

	private double credit;

	public void CreditAccount(){}
	public void doSome(){
		//错误: actno 在 Account 中是 private 访问控制
		//System.out.println(actno);
		// 间接访问
		//System.out.println(this.getActno());
		System.out.println(getActno());
	}
		// setter and getter方法
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}
}