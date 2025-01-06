package ch01;

public class Ddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int sum=0;		
		while(num<=10) { // num값이 10보다 작거나 같을 동안
			sum+=num;	 // 합계를 뜻하는 sum에 num을 더하고
			num++;		 // num에 1씩 더해 나감
			// while(조건식){
//			수행문1;
//			...
//			}
//			수행문2;
//			...
				do {
					sum+=num;     // 조건식이 참이 아니더라도 무조건 한 번 수행합
					num++;
				}while(num<=10);
				System.out.println("1부터 10까지의 합은"+sum+"입니다");
				
		//do {
//			수행문1;
//			...
		//}while(조건식);
//			수행문2;
//			...
				for(num=1; num<=5; num++) {    // 1 -> 2 -> 3-> 4
					System.out.println(num);
				}
				
				
				
				
				//				for(초기화식;조건식;증감식) {
//					수행문;
//				}
//				
				
		}
	}

}
