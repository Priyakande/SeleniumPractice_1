package SeleniumPractice_1;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + "Child thread executes whatever written in run method" + " "
					+ Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.setName("Thread_one");
		t2.setName("Thread_two");
		t3.setName("Thread_three");

	

		t1.start();
		t1.join();
		
	
		t2.start();
		t2.join();
		
		t3.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println(
					i + " " + "Main thread executes remaining program" + " " + Thread.currentThread().getName());
		}
	}
}
