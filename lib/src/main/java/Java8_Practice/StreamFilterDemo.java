package Java8_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(15);
		l.add(25);
		l.add(20);
		System.out.println(l);
		
		//filter
		List<Integer> l1 = l.stream().filter(i -> i%2 == 0 && i<15).collect(Collectors.toList());
		System.out.println(l1);
		
		


	}

}
