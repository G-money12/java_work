package training01;

public class Trainin_while {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num=1;
		int sum=0;
		
		while(num<=10) {
			sum+=num;
			num++;
			System.out.println("sum="+sum);
			System.out.println("num="+num);
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum);
	}

}
