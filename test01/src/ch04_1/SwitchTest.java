package ch04_1;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank=1;
		char color='S';
		switch(rank) {
		case 1: color='G';
		break;
		case 2: color='S';
		break;
		case 3: color='B';
		break;
		default:
			color='A';
		}
		System.out.println(color);
		
		if(rank==1) {
		System.out.println('G');
		}else if(rank==2) {
		System.out.println('S');
		}else if(rank==3) {
		System.out.println('B');
		}else {
			System.out.println('A');
		}
	}

}
