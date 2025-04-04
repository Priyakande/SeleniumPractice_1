package SeleniumPractice_1;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		
		try {
			String s = "Priya";
			int i = Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("Number Format Exception Demo with try catch");

	}

}
