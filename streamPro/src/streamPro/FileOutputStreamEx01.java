package streamPro;						// 바이너리 형식으로 저장하기

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {		// FileOutputStream은 같은 이름을 쓰면 안된다. 라이브리에서 제공하는 이름

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[]= {7, 51, 3, 4, -1, 24};
		try {
			FileOutputStream fout=new FileOutputStream("c:\\pgm\\test4.out");
			for(int i=0; i<b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		}catch(IOException ex) {
			System.out.println("입출력오류");
		}
	}

}
