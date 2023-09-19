package ch13;

public class ExTest03 {

	public static void parse(String str) {
		try {
			float f = Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			f = 0;
		} finally {
			System.out.println(f);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parse("korea");
	}

}
