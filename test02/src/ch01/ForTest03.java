package ch01;

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<10; i++) {     //
			for(int j=0; j<i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<10-i; j++) {
			System.out.print("*");
			}
			System.out.println();
	}
		for(int i=0; i<10; i++) {
			for(int j=-10; j<=10; j++) {
				if(Math.abs(j)<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	}
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=20-i; j++) {
				if(Math.abs(j)>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	}
		for(int i=-10; i<=10; i++) {
			for(int j=-10; j<=10; j++) {
				if(Math.abs(j)<=10-Math.abs(i))
						System.out.println("*");
				else
					System.out.println();
			}
		}
		
		
		
		
		
		
		for(int i=10; i>=5; i--) {
			for(int j=i; j>=i-5; j--) {
				System.out.println(j+"\t");
			}
			System.out.println();
		}
		
		}

}
