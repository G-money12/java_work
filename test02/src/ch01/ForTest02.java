package ch01;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int dan=2; dan<=9; dan++) {                               
			for(int times=1; times <=9; times++) {                    // for(초기화식; 조건식; 증감식) {
				System.out.print(dan+"X"+times+dan*times+"\t");		  // 실행식; }
		}
		System.out.println();
		}
	}

}
