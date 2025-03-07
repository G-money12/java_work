package vargex;

public class VargEx01 {
//	public static void show(String str) {
//		System.out.println(str);
//	}
//	public static void show(String str1, String str2) {
//		System.out.println(str1);
//		System.out.println(str2);
//	}
//	public static void show(String str1, String str2, String str3) {
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//	}
	public static void showAll(String...varg) {	// String 데이터가 ... 가변적으로 들어온다.
		for(String s:varg) {
			System.out.printf("%s ",s);
		}
		System.out.println(); 	// 줄바꿈
	}
	public static void showInt(int...varg) {
		for(int i:varg) {
			System.out.printf("%d ",i);
		}
		System.out.println(); 	// 줄바꿈
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showInt(10);
		showInt(10,20);
		showInt(10, 20, 30);
		showAll("abc");
		showAll("abcd","가나다");
		showAll("abcd","가나다","010-222-3333");
	}

}
