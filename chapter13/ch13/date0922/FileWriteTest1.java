package date0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* 작성일 : 2023년 9월 22일
 * 작성자 : 컴퓨터공학부 202095098 표건표
 * 설명 : 문자를 파일에 스기. (저장)
 */

public class FileWriteTest1 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("저장 파일을 입력하세요 : ");		
		String sfile = stdIn.next();
		
		// 파일에 저장할 문자열 생성
		String source = "비어 있어야 비로소 가득해지는 사람 \n" + "영원히 사랑한다는 것은\n" + 
		"평온한 마음으로 아침을 맞는다는 것입니다.\n";
		
		// 파일명을 객체 생성
		FileWriter fw = new FileWriter(sfile);
		
		// 문자열을 파일에 출력.
		fw.write(source);  // 객체를 통해 a.txt 파일에 source에 있는 내용을 출력(저장)
		
		// 출력 스트림 닫기
		fw.close();
		
		System.out.println("파일이 생성되었습니다.");
	}

}
