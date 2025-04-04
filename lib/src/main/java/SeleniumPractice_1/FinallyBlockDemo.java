package SeleniumPractice_1;

public class FinallyBlockDemo {

	public static void main(String[] args) {

		try {
			int res = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Java finally block is always executed whether an exception is handled or not");
		}
		System.out.println("rest of the code");
	}

}
