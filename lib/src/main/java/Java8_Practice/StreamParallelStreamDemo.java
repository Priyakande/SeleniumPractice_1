package Java8_Practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamParallelStreamDemo {

	public static void main(String[] args)
	{
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		l1.parallelStream().filter(n-> n%2 != 0).forEach(n-> System.out.println(n));
		
		// convert stream to parallel stream
		Stream<Integer> s1 = l1.stream();
		s1.parallel().filter(n-> n%2 != 0).forEach(n-> System.out.println(n));
		
	}

}
