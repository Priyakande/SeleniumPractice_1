package SeleniumPractice_1;
class demo
{
	public int add (int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	double add (double a, double b)
	{
		double c = a + b;
		return c;
	}
	
	protected int add(int a, int b, int c)
	{
		int d = a+b+c;
		return d;
	}
}
public class MethodOverloading 
{
	public static void main(String [] args )
	{
		demo dmo = new demo();
		
		int result = dmo.add(2,3);
		System.out.println(result);
		
		double result1 = dmo.add(2.1,3.4);
		System.out.println(result1);
		
		int result2 = dmo.add(2,3,4);
		System.out.println(result2);
		
		
	}
}

