package ex01;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] array=new int[10];
		int count=0;
		
		while(count<10) {
			int random=(int)(Math.random()*100)+1;
			if(random%3 == 0 && !contains(array, random)) {
				array[count++]=random;
			}
		}
		System.out.println("배열에 저장된 3의 배수");
		Arrays.stream(array).forEach(num->System.out.println(num+""));
	}
		private static boolean contains(int[]array, int value) {
			for(int num:array) {
				if(num==value) {
					return true;
				}
			}
			return false;
		}
}
