package ch03;

import java.util.Scanner;

public class OpEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		
		System.out.println("점수를 소수점 1자리까지 입력하세요");
		float core1 = sc.nextFloat();
		float core2 = sc.nextFloat();
		
		System.out.println(score1 >=70 && score2>=70);
		System.out.println(score1>=70 || score2>=70);
		System.out.println(!(score1>=70 && score2>=70));
		System.out.println(!(score1>=70 || score2>=70));
		
		System.out.println("ㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷ");
		System.out.println(core1 >=70 && core2>=70);
		System.out.println(!(core1 >=70 && core2>=70));
		
		sc.close(); // 
	}

}
