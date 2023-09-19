package ch13;

public class ExTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 2;
		
		try {
			System.out.print("2/0은 : ");
			int div = b / a;
			System.out.println(div);
		} catch (RuntimeException ex) {
			System.out.println("RuntimeException 예외발생");
		} catch (Exception ex) {
			System.out.println("Exception 예외발생");
		}
	}
}
