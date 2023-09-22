package date0922;

import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;

/* 작성일 : 2023년 9월 22일
 * 작성자 : 컴퓨터공학부 202095098 표건표
 * 설명 : 바이트 단위로 파일에 저장. (파일 생성)
 */

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("저장 파일명을 입력하세요 : ");		
		String sfile = stdIn.next();
		
		// 파일명으로 객체 생성
		FileOutputStream fos = new FileOutputStream(sfile);
		
		int i;
		for(i = 1; i <= 260; i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println(sfile + "파일명으로 바이트 파일을 생성하였습니다.");
	}
}
