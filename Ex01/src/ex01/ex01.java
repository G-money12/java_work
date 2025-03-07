
package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("지불할 금액을 입력하세요 (최소 10만원 단위)");
		
		int score= sc.nextInt();
		int[]countArray= {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		
		if (score<100000) {
			System.out.println("금액은 최소 10만원 단위로 입력해야 합니다.");
			return;
		}
		int[] counts=new int[countArray.length];
		
		for(int i=0; i<countArray.length; i++) {
			counts[i]=score / countArray[i];
			score %= countArray[i];
		}
		
		System.out.println("화폐 단위별 필요한 개수");
		for (int i =0; i < countArray.length;i++) {
			System.out.printf("%6d원권: %d매\n", countArray[i], counts[i]);
		}
		
	}

}