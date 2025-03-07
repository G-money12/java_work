package test04;

import java.util.Scanner;

public class ddd {
	int circle;
	int circle2;
	
	public int getArea() {
		return 3*circle*circle2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ddd rect = new ddd();
		Scanner scanner=new Scanner(System.in);
		System.out.println(">>");
		
		rect.circle=scanner.nextInt();
		rect.circle2=scanner.nextInt();
		
		System.out.println("원형의 면적은" +rect.getArea());
		
		scanner.close();
	}

}
