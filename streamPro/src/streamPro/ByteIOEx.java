package streamPro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin;
		FileOutputStream fout;
		byte[] buf=new byte[100];
		try {
			fin=new FileInputStream("c:/pgm/abc.jpg");
			fout=new FileOutputStream("c:/pgm/abc2.jpg");
			int c;
			while((c=fin.read(buf))!=-1) {
				fout.write(buf, 0, c);
			}
			fin.close();
			fout.close();
			
			
		}catch(IOException ex) {
			System.out.println("IO error");
		}
		
	}

}
