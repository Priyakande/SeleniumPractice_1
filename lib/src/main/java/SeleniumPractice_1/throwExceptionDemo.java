package SeleniumPractice_1;

public class throwExceptionDemo {
	static void validate (int age)
	{
		if(age<18) {
			throw new ArithmeticException ("User is not applicable to vote");
		}
		else {
			System.out.println("User is applicable to vote");
		}
	}

	public static void main(String[] args) {
		validate(13);
		System.out.println("rest of the code");
		
	}

}
