// ʹ�ü̳л�����������븴�����⡣
// �̳�Ҳ�Ǵ���ȱ��ģ���϶ȸߣ������޸ģ�������ǣ����
public class ExtendsTest01{
	public static void main(String[] args){
		// ������ͨ�˻�
		Account a1 = new Account("10001",10000);
		System.out.println("�˺�:"+a1.getActno()+"��"+a1.getBalance());

		CreditAccount ca1 = new CreditAccount();
		ca1.setActno("10002");
		ca1.setBalance(-110020);
		ca1.setCredit(98);
		System.out.println(ca1.getActno() + ",���" + ca1.getBalance() + ",������" + ca1.getCredit());
	}
}


// �����˻���
// �˻������ԣ��˺š����
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
// �������͵��˻������ÿ��˻�
// �˺š���������

class CreditAccount extends Account{

	private double credit;

	public void CreditAccount(){}
	public void doSome(){
		//����: actno �� Account ���� private ���ʿ���
		//System.out.println(actno);
		// ��ӷ���
		//System.out.println(this.getActno());
		System.out.println(getActno());
	}
		// setter and getter����
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}
}