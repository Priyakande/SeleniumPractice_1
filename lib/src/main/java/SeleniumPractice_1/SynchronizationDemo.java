package SeleniumPractice_1;

class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Good morning" +" "+ name);
		}
	}
}

class Mythread2 extends Thread {
	String name;
	Display d;

	Mythread2(Display d, String name) {
		this.name = name;
		this.d = d;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizationDemo {
	public static void main(String[] args) {
		Display d = new Display();
		Mythread2 t1 = new Mythread2(d, "Priya");
		Mythread2 t2 = new Mythread2(d, "Navnath");

		t1.start();
		t2.start();
	}
}
