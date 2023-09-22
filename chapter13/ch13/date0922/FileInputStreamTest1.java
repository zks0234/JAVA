package date0922;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/* 작성일 : 2023년 9월 22일
 * 작성자 : 컴퓨터공학부 202095098 표건표
 * 설명 : 바이트 단위로 읽어 출력. (파일 생성)
 */

public class FileInputStreamTest1 {

	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("읽을 파일명을 입력하세요. : ");
		String sfile = stdIn.next();  // 문자열로 입력한 파일명 저장.
		
		// 읽으들일 파일명으로 객체 생성
		FileInputStream fis = new FileInputStream(sfile);
		
		// 한 바이트씩 읽기
		int i;
		while((i = fis.read()) != -1) {  // 데이터를 모두 읽으면 -1 변환
			System.out.print((char)i);
		}
		fis.close();
		
		System.out.println(sfile + "파일로부터 바이트를 읽어 화면에 출력하였습니다.");
	}

}
