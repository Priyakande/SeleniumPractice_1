package SeleniumPractice_1;

class Singleton {
	private static Singleton singletonObject;

	public Singleton() 
	{

	}

	static Singleton getObject() {
		if (singletonObject == null) {
			singletonObject = new Singleton();
		}
		return singletonObject;
	}
}

public class DemoSingleton {
	public static void main(String x[]) 
	{
		Singleton object1 = Singleton.getObject();
		System.out.println(object1);
		


	}

}
