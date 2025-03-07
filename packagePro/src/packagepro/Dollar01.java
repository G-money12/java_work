package packagepro;

import java.util.Scanner;

class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {
		rate = r; // 환율설정.KWR/S1
	}
}
public class Dollar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("환율(1달러)>>");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println
		("백만원은 $" + CurrencyConverter.toDollar(1000000) +"입니다");
		System.out.println
		("$100은" + CurrencyConverter.toKWR(100)+"원입니다.");
		scanner.close();

	}

}
