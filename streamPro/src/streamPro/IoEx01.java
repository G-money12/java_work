package streamPro;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rd=new InputStreamReader(System.in);
		try {
			FileReader fin=new FileReader("C:\\pgm\\test.txt");
			int c;
			char[] cbuf=new char[2];
			while((c=fin.read(cbuf,0, cbuf.length))!=-1) {
				System.out.println(c+" ");
				for(int i=0; i<c; i++) {
					System.out.print(cbuf[i]);
				}
				System.out.println();
//				int c=fin.read();
//				if(c==-1) {
//					break;
//				}
//				System.out.println((char)c);
			}
			fin.close();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
	}
}



