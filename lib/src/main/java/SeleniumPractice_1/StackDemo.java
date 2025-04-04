package SeleniumPractice_1;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack <Integer> stk = new Stack <Integer> ();
		
//		empty()-> The empty() method checks the stack is empty or not
		System.out.println("The empty() method checks the stack is empty or not: " + stk.empty());
		
//		push(E item)-> The push() method pushes (insert) an element onto the top of the stack.
		System.out.println("\nThe push() method pushes (insert) an element onto the top of the stack");
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.push(6);
		System.out.println(stk);
	
//		pop()-> The pop()method removes an element from the top of the stack and returns the same element as the value of that function
		System.out.println("\nThe pop()method removes an element from the top of the stack and returns the same element: " + stk.pop());
		
//		peek()-> The peek()method looks at the top element of the stack without removing it
		System.out.println("\nThe peek()method looks at the top element of the stack without removing it: "+ stk.peek());
		
//	    search(Object o)-> The search() method searches the specified object and returns the position of the object
		System.out.println("\nsearch() method searches the specified object and returns the position of the object: "+ stk.search(2));
		
	}
}
