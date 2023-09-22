package date0922;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException {
		// 파일 객체 생성
		File file = new File("c.txt");
		
		// FileReader 객체 생성
		FileReader fr = new FileReader(file);
		
		// 한 문자씩 읽기
		int i;
		while((i = fr.read()) != -1) {  // 데이터를 모두 읽으면 -1 변환
			System.out.print((char)i);
		}
		fr.close();  // 스트림 닫기

	}

}
