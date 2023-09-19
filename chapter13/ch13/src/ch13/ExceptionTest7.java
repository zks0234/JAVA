package ch13;

import java.util.InputMismatchException;
import java.util.Scanner;

// 나이를 입력받아 출력하시오.
// 입력받은 나이가 정수가 아닌 경우 예외처리 하시오.

public class ExceptionTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");		
		
		try {
			int age = Integer.parseInt(stdin.next());
			System.out.println("당신의 나이는 " + age + "세 입니다.");	
		} catch (NumberFormatException e) {
			System.out.println("나이는 정수로 입력하세요.");
		}
	}
}
