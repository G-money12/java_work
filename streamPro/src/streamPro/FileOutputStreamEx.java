package streamPro;				// 바이너리 코드를 읽는 예제

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b=new byte[100];
		try {
			FileInputStream fin=new FileInputStream("c:/pgm/test4.out");
			int n=0;
			int c;
			while((c=fin.read())!=-1) {
				System.out.print((byte)c+" ");
				b[n]=(byte)c;
				n++;
			}
			System.out.println();
			System.out.println("test4.out에서 읽은 배열을 출력");
			for(int i=0; i<n; i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
		}catch(IOException ex) {
			System.out.println("파일입력오류");
			
		}
	}

}
