package Java8_Practice;

import java.util.Arrays;
import java.util.List;

public class StreamForeachDemo {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7);
		l1.stream().map(n-> n+1).forEach(n-> System.out.println(n));
	}

}
