package SeleniumPractice_1;

public class ArrayOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5};
		
		try {
			arr[10] = 10;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Array Index Out Of Bound Exception Demo with try catch");
	}

}
