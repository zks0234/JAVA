package 연습문제;

public class StringBufferTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		
		System.out.println(sb1.append("korea"));
		System.out.println(sb2.append(sb1));
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb2.substring(5, 9));
		System.out.println(sb2.delete(5, 10));
		System.out.println(sb2);
		System.out.println(sb1.reverse());
	}

}
