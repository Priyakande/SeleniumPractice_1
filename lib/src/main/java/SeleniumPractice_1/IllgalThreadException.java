package SeleniumPractice_1;

public class IllgalThreadException extends Thread {

	public static void main(String[] args) 
	{
		IllgalThreadException th = new IllgalThreadException();
		th.start();
		th.start();
	}

}
