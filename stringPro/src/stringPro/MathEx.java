package stringPro;

import java.util.Random;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			int n=(int)(Math.random()*100)+1;
			System.out.println(n);
		}
		System.out.println("+++++++++++++++");		// java.util.Random 클래스를 이용하여 난수 발생.
		Random r=new Random();
		for(int i=0; i<10;i++) {
			int n=r.nextInt(30)+70;
			System.out.println(n);
		}
	}

}
