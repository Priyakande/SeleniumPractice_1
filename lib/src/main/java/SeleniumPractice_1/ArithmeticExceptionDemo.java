package SeleniumPractice_1;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) 
	{
		try {
			int res = 100/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Arithmetic Exception Handling with try catch");

	}

}
