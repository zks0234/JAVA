package 연습문제;

class TestTest {
	public String text;
	public TestTest(String s) {
		this.text = s;
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTest test = new TestTest("ABC");
		System.out.println(test.text.toLowerCase());
	}

}
