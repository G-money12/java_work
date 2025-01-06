package ch01;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum=0;
//		for(int i=1; i<=100; i++) {
//			if(i%2==0)
//				continue;                         // continue : continue를 만나면 다음 작업을 하지않고 다음 조건식으로 넘어간다.
//			sum+=i;
//			System.out.println("i="+i+",sum="+sum);
//		}
//		System.out.println("sum="+sum);
//	}
		int sum=0;
		int num=0;
		for(num=0; ;num++) {
			sum += num;
			if(sum>=100)
				break;
		}
		System.out.println("num:"+num);
		System.out.println("sum:"+sum);
		}
}
