package ch13;

public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x();
	}
	static void x() {
		y();
	}
	static void y() {
		z();
	}
	static void z() {
		int i = 1;
		int j = 0;
		System.out.println(i / j);
	}
}
