package Java8_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpressionWithCollectionDemo {

	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList <Integer> ();
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(5);
		al.add(15);
		System.out.println(al);
		
		Comparator<Integer> c =(i1,i2)-> (i1<i2)? -1 : (i1>i2)? 1 : 0;
		Collections.sort(al,c);
		System.out.println(al);

		
	}

}
