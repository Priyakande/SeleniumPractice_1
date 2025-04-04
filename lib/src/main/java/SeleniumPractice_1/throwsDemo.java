package SeleniumPractice_1;

import java.io.IOException;

public class throwsDemo {

	static void m() throws IOException {
		throw new IOException("device error");
	}
	
	public static void main(String[] args) {
		try {
			m();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
