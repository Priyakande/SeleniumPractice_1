package SeleniumPractice_1;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) 
	{
		PriorityQueue <String> pq = new PriorityQueue <String> ();
		
//		boolean add(object)->insert the element int queue
		System.out.println("boolean add(object)->insert the element int queue:");
		pq.add("Priya");
		pq.add("Pooja");
		pq.add("Komal");
		pq.add("Bebo");
		pq.add("Arohi");
		System.out.println(pq);
		
//		boolean offer(object)->insert the specified element into queue.
		System.out.println("\noffer(object)->insert the specified element into queue");
		pq.offer("Neha");
		System.out.println(pq);
		
//		Object peek()-> retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println("\npeek()->retrieves the head of this queue: "+ pq.peek());
//		Object element()-> retrieves the head of this queue.
		System.out.println("element()-> retrieves the head of this queue: "+ pq.element());
		
//		Object remove()-> retrieves and removes the head of this queue.
		System.out.println("\nObject remove()-> retrieves and removes the head of this queue: " + pq.remove());
		System.out.println(pq);
//		Object poll()-> retrieves and removes the head of queue, or returns null if queue is empty.
		System.out.println("poll()-> retrieves and removes the head of queue: "+ pq.poll());
		System.out.println(pq);

		

		
		


	}

}
