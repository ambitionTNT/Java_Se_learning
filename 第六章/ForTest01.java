public class ForTest01{
	public static void main(String[] args){
		/*
			使用for循环，实现1-100所有技术求和
		*/
		int sum1=0;
		int sum2=0;
		for (int i=1;i<=100 ;i+=2 ){
			sum1+=i;
		}
		for(int i=1;i<=100;i++){
			if(i%2==1){
				sum2+=i;
			}
		}
		
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);


	}

}