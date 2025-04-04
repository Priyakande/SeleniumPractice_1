package Java8_Practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatDemo {
	public static void main(String [] args) {
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(4,5,6);
		
		Stream<Integer> s1 = l1.stream();
		Stream<Integer> s2 = l2.stream();

		 Stream.concat(s1, s2).forEach(n-> System.out.println(n));

		
	}

}
