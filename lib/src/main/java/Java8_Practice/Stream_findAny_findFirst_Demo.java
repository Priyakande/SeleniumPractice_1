package Java8_Practice;

import java.util.*;

public class Stream_findAny_findFirst_Demo {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		
		//findAny -- returns any first element
		Optional<Integer> ele = l1.stream().findAny();
		System.out.println(ele.get());
		
		//findFirst
		Optional<Integer> f1 = l1.stream().findFirst();
		System.out.println(f1.get());


	}

}
