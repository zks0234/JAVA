package ch13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print(e + "파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("파일을 읽을 수 없습니다.");
		}
	}

}
