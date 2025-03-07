package ex01;

public class Ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%4s","|");
		for(int i=1; i<=9; i++)
			System.out.printf("%4d",i);
		System.out.println();
		System.out.println("-----------------------------------------");
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d%2s",i,"|");
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d ",i*j);                    // printf 형식이 정수이고 폭을 글자3 쓸만큼 가지겠다.
			}
			System.out.println();
		}
	}

}
