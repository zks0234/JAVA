package chapter16;

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String s1 = "name pyogp gender m age 23";
		String s2 = "name,pyogp,gender,m,age,23";
		String s3 = "name/pyogp/gender/m/age/23";
		
		System.out.println(":: 빈칸을 기준으로 분리 ::");
		StringTokenizer st1 = new StringTokenizer(s1);
		
		// 토큰이 있으면 true, 없으면 false로 반환
		while (st1.hasMoreTokens()) {
			String first = st1.nextToken(); // 다음 토큰을 기준으로 문자열을 반환
			String second = st1.nextToken();
			System.out.println(first + "\t" + second);
		}
		
		System.out.println(":: ,를 기준으로 분리 ::");
		StringTokenizer st2 = new StringTokenizer(s2,","); // 분리자가 쉼표
		while (st2.hasMoreTokens()) {
			String first = st2.nextToken(); // 다음 토큰을 기준으로 문자열을 반환
			String second = st2.nextToken();
			System.out.println(first + "\t" + second);
		}
		
		System.out.println(":: /를 기준으로 분리 ::");
		StringTokenizer st3 = new StringTokenizer(s2,","); // 분리자가 슬래시
		while (st3.hasMoreTokens()) {
			String first = st3.nextToken(); // 다음 토큰을 기준으로 문자열을 반환
			String second = st3.nextToken();
			System.out.println(first + "\t" + second);
		}
	}
}