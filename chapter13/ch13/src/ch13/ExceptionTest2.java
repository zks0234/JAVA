// 2개의 정수를 입력받아 나눗셈 하는 프로그램
package ch13;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("첫 번째 수 입력 : ");
		int num1 = stdin.nextInt();
		System.out.println("두 번째 수 입력 : ");
		int num2 = stdin.nextInt();
		
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println("해당 예외 : " + e);
//			e.printStackTrace(); 
		}
	}

}
