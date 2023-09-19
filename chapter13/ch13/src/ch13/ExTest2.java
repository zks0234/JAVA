package ch13;

public class ExTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
			System.out.println("메소드 호출 후");
		} catch (ArrayStoreException ex) {
			System.out.println("ArrayStoreException 예외발생");
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException 예외발생");
		}
	}
	static void method1() throws RuntimeException {
		int a = 0;
		int b = 2 / a;
		System.out.println("나눗셈 후");
	}
}
