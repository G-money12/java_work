package ex01;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("   |");
		for(int i = 1; i<=9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("---+------------------");
		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%2d |", i);
			for(int j = 1; j<=9; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}

}
