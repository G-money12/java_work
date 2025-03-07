package fileTest;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f0=new File("c:/pgm");
		File f1=new File("c:/pgm/test.txt");
		File f2=new File("c:/pgm","abc.jpg");
		File f3=new File(f0, "abc.jpg");
		System.out.println("파일크기:"+f1.length());
		System.out.println("파일명:"+f1.getName());
		System.out.println("경로:"+f1.getPath());
		System.out.println("부모경로"+f1.getParent());
		System.out.println("파일여부"+f1.isFile());
		System.out.println("파일여부:"+f1.isFile());
		System.out.println("f1 디렉토리여부:"+f1.isDirectory());
		System.out.println("f0 디렉토리여부:"+f0.isDirectory());
		
		File[] subFiles=f0.listFiles();
		System.out.println("---------------------------------");
		for(int i=0; i<subFiles.length; i++) {
			System.out.print(subFiles[i].getName()+" ");
			if(subFiles[i].isFile())
				System.out.println(subFiles[i].length());
			else
				System.out.println();
		}	
	}

}
