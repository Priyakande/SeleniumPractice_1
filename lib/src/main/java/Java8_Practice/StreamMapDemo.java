package Java8_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Priya", "Pooja", "Snehal", "Komal", "Swati");
		System.out.println(l);
		List<String> ul = l.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ul);
	}

}
