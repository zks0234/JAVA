package 연습문제;

public class WrapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = Integer.valueOf(1) + Integer.valueOf(2);
		
		switch (i) {
		case 3 :
			System.out.println("three");
			break;
		default : 
			System.out.println("other");
			break;
		}

	}

}
