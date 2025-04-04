package SeleniumPractice_1;

public class NestedTryBlockDemo {

	public static void main(String[] args) {

		try {
			try {
				try {
					int a[] = { 1, 2, 3, 4, 5 };
					a[10] = 10;
				} catch (ArithmeticException e1) {
					System.out.println(e1);
				}
			} catch (ArithmeticException e2) {
				System.out.println(e2);
			}
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println(e3);
			System.out.println(
					"As Exception is not handled by inner catch block 1 & 2, it is trasferred to parent/outer catch block");
		}

	}
}
