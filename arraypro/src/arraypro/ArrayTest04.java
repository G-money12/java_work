package arraypro;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {10, 7, 8, 45, 52};
		System.out.println(intArray.length);
				
		int sum=0;
		int max=0;  
		
		for(int num:intArray) {         // for each 문 배열의 구성요서를 한개씩 가져와서 처리한다.
			if(num>max) {
				max=num;
			}
		}System.out.println(max);
		max=0;
		
		
		for(int num:intArray) {
			
			sum+=num;
			}
		
		

		
		for(int i=0; i<intArray.length; i++) {
			sum+=intArray[i];
		}
		int avg=sum/intArray.length;		 // 평균
		System.out.println("avg="+avg);      //
		
		                         // 최대값을 구할때는 max값을 작은값을 넣는다.
		for(int i=0; i<5; i++) {
			if(intArray[i]>max) {
				max=intArray[i];
			}
			
		}
		System.out.println(max);	
	}

}
