package Java8_Practice;

import java.util.*;

public class Stream_AnyMatch_AllMatch_NoneMatch_Demo {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("Priya", "Pooja", "Nano", "Komal");
		
		//anymatch -- at least one should match
		System.out.println(l1.stream().anyMatch(s-> s == "Priya"));
		
		//allMatch -- all should match
		System.out.println(l1.stream().allMatch(s-> s == "Priya"));
		
		//noneMatch -- None should match
		System.out.println(l1.stream().noneMatch(s-> s == "Priya"));


	}

}
