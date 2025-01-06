package ch01;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int sum=0;
		do {
			sum+=num;
			num++;
			System.out.println("num="+num);
			System.out.println("sum="+sum);
		}while(num<=10);
		System.out.println("num="+num);
		System.out.println("sum="+sum);
	}
	
}

// do while : 먼저 수행하고 판단한다. 마지막 한번은 수행한다. 

// 소문자를 대문자로 만들기 : 대문자 - 32 = 소문자다.		