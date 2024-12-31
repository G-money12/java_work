package ch02;

public class BinaryTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int = 정수 메모리 타입
		int num=10;        // 
		int bNum=0B1010;
		int oNum=012;
		int hNum=0XA;
		
		
		// -128 ~ 0 ~ 127 양의 정수 127 0 음의정수 -128
		// 양의 정수 -> 보수(bit반전) -> +1
		int bNum2=0B00000000000000000000000000000101;
		int bNum3=0B11111111111111111111111111111011;
		
		// 주석, /* */: 여러줄 주석 Ctrl + / : 여러줄 주석 활성화, 제외
		
		// 		
		
		// System.out.println(); 단축키 : sysout + Ctrl + space  
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		
		System.out.println(bNum2+bNum3);
		
		System.out.println(bNum2);
		System.out.println(bNum3);
		
		
	}

}
