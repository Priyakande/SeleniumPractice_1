package Java8_Practice;

import java.util.Arrays;
import java.util.List;

public class StreamtoArrayDemo {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		Object[] arr = l1.stream().toArray();
		System.out.println(arr.length);
	}
	

}
