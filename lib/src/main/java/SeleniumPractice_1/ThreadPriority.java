package SeleniumPractice_1;

class Mythread_1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + "Child thread executes whatever written in run method" + " "
					+ Thread.currentThread().getName());
		}
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		Mythread_1 t1 = new Mythread_1();
		Mythread_1 t2 = new Mythread_1();
		Mythread_1 t3 = new Mythread_1();
		
		t1.setName("Thread_one");
		t2.setName("Thread_two");
		t3.setName("Thread_three");

	
		t1.setPriority(1);
		t2.setPriority(9);
		t3.setPriority(5);
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
