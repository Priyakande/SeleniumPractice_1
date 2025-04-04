package Java8_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapDemo {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(4,5,6);
		List<Integer> l3 = Arrays.asList(7,8,9);
		
		List<List<Integer>> l4 = Arrays.asList(l1,l2,l3);
		
		List<Integer> l5 = l4.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
		System.out.println(l5);


	}

}
