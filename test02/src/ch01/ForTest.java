package ch01;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;											// int 선언 초기값 : 0
		for(int num=1; num<=10;num++) {                   	// for문(초기화식: int num선언 값=1, 조건식: num은 10보다 작거나 같다; num은 1씩 증가) 
			sum+=num;										// 실행문: sum에 num을 더해서 sum에 넣는다.
			System.out.println("num="+num+", sum="+sum);
			
		}
	}

}
