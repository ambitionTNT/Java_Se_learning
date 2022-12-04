public class ForTest02{
	public static void main(String[] args){
		//Êä³ö99³Ë·¨±í
		int j;
		for (int i=1;i<10 ;i++ ){
			for( j=1;j<=i;j++){
				System.out.print(j+"x"+i+"="+(i*j)+'\t');
			}
			System.out.print('\n');
		}

	}

}