package streamPro;						// c -> Windows -> system.ini 복사, 저장

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin;
		FileOutputStream fout;
		
		byte[] buf=new byte[10];
		try {
			fin=new FileInputStream("c:/Windows/system.ini");
			fout=new FileOutputStream("c:/pgm/system.txt");
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
