package SeleniumPractice_1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList <String> Ll = new LinkedList <String> ();
		
		//add() -> append element at the end of list
		Ll.add("one");
		Ll.add("two");
		Ll.add("three");
		Ll.add("four");
		Ll.add("five");
		System.out.println("add(element)->append element at the end of list " + Ll + "\n");
		
		
		System.out.println("Iterate through loop");
		for(String l : Ll)
		{
			System.out.println(l);
		}
		
		//add(index, element) -> add element at specific index
		System.out.println("\nadd(index, element) -> add element at specific index");
		LinkedList <String> Ll1 = new LinkedList <String> ();
		Ll1.add(0, "eleven");
		Ll1.add(1, "twelve");
		Ll1.add(2, "thirteen");
		Ll1.add(3, "fourteen");
		Ll1.add(4, "fifteen");
		Ll1.add(5, "sixteen");
		System.out.println(Ll1 + "\n");
		
		//addAll(int index, Collection<? extends E> c) append all the elements in the specified collection, starting at the specified position of the list.
		System.out.println("addAll(int index, Collection<? extends E> c)-> append all the elements in the specified collection, starting at the specified position of the list.");
		Ll.addAll(0,Ll1);
		System.out.println(Ll + "\n");
		
		//addFirst(element)-> insert the given element in the begining of list
		System.out.println("addFirst(element)->insert the given element in the begining of list");
		Ll.addFirst("Zero");
		System.out.println(Ll + "\n");
		
		//addLast(E e) ->append the given element to the end of a list.
		System.out.println("addLast(E e) ->append the given element to the end of a list");
		Ll.addLast("Hundread");
		System.out.println(Ll + "\n");
		
		//clear()-> remove all the elements from a list.
		
//		clone()-> return a shallow copy of an ArrayList.
		System.out.println("clone()-> return a shallow copy of an ArrayList.");
		Object Ll_Copy = Ll.clone();
		System.out.println(Ll_Copy + "\n");
		
//		contains(Object o)-> return true if a list contains a specified element.
		System.out.println("contains(Object o)-> return true if a list contains a specified element: "+ Ll.contains("Zero") + "\n");
		
//		Iterator<E> descendingIterator()-> return an iterator over the elements in a deque in reverse order.
		System.out.println("Iterator<E> descendingIterator()-> return an iterator over the elements in a deque in reverse order");
		Iterator itr = Ll1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		E element()-> retrieve the first element of a list
		System.out.println("\nE element()-> retrieve the first element of a list: " + Ll.element());
		
//		E get(int index)-> return the element at the specified position in a list
		System.out.println("\nE get(int index)-> return the element at the specified position in a list: "+ Ll.get(0));
		
//		E getFirst()-> return the first element in a list
		System.out.println("\nE getFirst()-> return the first element in a list: "+ Ll.getFirst());
		
		
				
//		E getLast()-> return the last element in a list
		System.out.println("\nE getLast()-> return the last element in a list: "+ Ll.getLast());
		
//		int indexOf(Object o)-> return the index in a list of the FIRST occurrence of the specified element, or -1 if the list does not contain any element.
		System.out.println("\nint indexOf(Object o)-> return the index in a list of the FIRST occurrence of the specified element, or -1 if the list does not contain any element: "+ Ll.indexOf("Zero"));
		
//		int lastIndexOf(Object o)->return the index in a list of the LAST occurrence of the specified element, or -1 if the list does not contain any element.
		System.out.println("\nint lastIndexOf(Object o)->return the index in a list of the LAST occurrence of the specified element, or -1 if the list does not contain any element: "+ Ll.lastIndexOf("Zero"));
		
//		boolean offer(E e)-> It adds the specified element as the last element of a list.
		System.out.println("\nboolean offer(E e)-> It adds the specified element as the last element of a list: "+ Ll.offer("HundreadAndOne"));
		System.out.println(Ll + "\n");
		
//		boolean offerFirst(E e)-> It inserts the specified element at the front of a list.
		System.out.println("boolean offerFirst(E e)-> It inserts the specified element at the front of a list: "+ Ll.offerFirst("NoElement"));
		System.out.println(Ll + "\n");

//		boolean offerLast(E e)-> It inserts the specified element at the end of a list.
		System.out.println("boolean offerLast(E e)-> It inserts the specified element at the end of a list: "+ Ll.offerLast("HundreadAndTwo"));
		System.out.println(Ll + "\n");
		
//		E peek()-> It retrieves the first element of a list
		System.out.println("\nE peek()-> It retrieves the first element of a list: "+ Ll.peek());
		
//		E peekFirst()-> It retrieves the first element of a list or returns null if a list is empty.
		System.out.println("\nE peekFirst()-> It retrieves the first element of a list or returns null if a list is empty: "+ Ll.peekFirst());
		
//		E peekLast()-> It retrieves the last element of a list or returns null if a list is empty.
		System.out.println("\nE peekLast()-> It retrieves the last element of a list or returns null if a list is empty: "+ Ll.peekLast());
		
//		E poll()-> It retrieves and removes the first element of a list.
		System.out.println("\nE poll()-> It retrieves and removes the first element of a list: "+ Ll.poll());
		
//		E pollFirst()-> It retrieves and removes the first element of a list, or returns null if a list is empty.
		System.out.println("\nE pollFirst()-> It retrieves and removes the first element of a list, or returns null if a list is empty: "+ Ll.peekFirst());
		
//		E pollLast()-> It retrieves and removes the last element of a list, or returns null if a list is empty.
		System.out.println("\nE pollLast()-> It retrieves and removes the last element of a list, or returns null if a list is empty: "+ Ll.pollLast());
		
//		E remove()-> retrieve and removes the first element of a list.
		System.out.println("\nE remove()-> retrieve and removes the first element of a list: "+ Ll.remove());
		System.out.println(Ll);
		
//		E remove(int index)-> remove the element at the specified position in a list.
		System.out.println("\nE remove(int index)-> retrive and remove the element at the specified position in a list: "+ Ll.remove(0));
		System.out.println(Ll);
		
//		boolean remove(Object o)-> remove the first occurrence of the specified element in a list.
		System.out.println("\nboolean remove(Object o)-> remove the first occurrence of the specified element in a list: "+ Ll.remove(" "));
		System.out.println(Ll);

//		E removeFirst()-> It removes and returns the first element from a list.
		System.out.println("\nE removeFirst()-> It removes and returns the first element from a list: "+ Ll.removeFirst());
		System.out.println(Ll);

//		boolean removeFirstOccurrence(Object o)->remove the first occurrence of the specified element in a list.
//		E removeLast()->It removes and returns the last element from a list.
//		boolean removeLastOccurrence(Object o)-> It removes the last occurrence of the specified element in a list (when traversing the list from head to tail).
		

		


		
	} 

}
