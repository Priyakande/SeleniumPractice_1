package Java8_Practice;

import java.util.Arrays;
import java.util.List;

public class Stream_Distinct_Count_Limit_Demo {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,4,3,2,1);
		
		l1.stream().distinct().forEach(n-> System.out.println("distinct values: " + n));
		System.out.println("Count is: "+ l1.stream().count());
		l1.stream().limit(3).forEach(n->System.out.println("limit:"+ n));
		
	}

}
