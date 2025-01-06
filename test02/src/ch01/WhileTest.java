package ch01;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		int sum=0;
		
		while(num<=10) {
			sum+=num;		   // sum에 num값을 더해서 sum에 넣어주세요.										
			num++;             // +1
			System.out.println("sum="+sum);
			System.out.println("num="+num);
			
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum);
	}

}
