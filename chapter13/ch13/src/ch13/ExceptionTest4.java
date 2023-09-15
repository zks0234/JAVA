package ch13;

import java.io.FileReader;

public class ExceptionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("a.txt");
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}

}
