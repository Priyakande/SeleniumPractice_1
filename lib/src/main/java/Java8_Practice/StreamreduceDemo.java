package Java8_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamreduceDemo {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("a","b","1","b");
		Optional<String> l2 = l1.stream().reduce((n1,n2)-> {
			return n1+n2;}
		);
		System.out.println(l2.get());
		}
	}


