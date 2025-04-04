package SeleniumPractice_1;

public class NullPointerExceptionDemo {

	public static void main(String[] args) 
	{
		try {
			String str = null;
			str.length();
		}
  catch(NullPointerException e)
		{
	System.out.println(e);
		}
		System.out.println("Null Pointer Exception Demo with try catch");
	}

}
