package Java8_Practice;

import java.util.*;
import java.util.List;

import com.google.common.base.Optional;

public class Stream_Min_Max_Demo {

	public static void main(String[] args) {
		 List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
		 //min
		 java.util.Optional<Integer> l2 = l1.stream().min((n1,n2)->{
			 return n1.compareTo(n2);
			 });
		 System.out.println(l2.get());
		 //max
		java.util.Optional<Integer> l3 = l1.stream().max((n1,n2)-> {
			 return n1.compareTo(n2);}
		 );
		 System.out.println(l3.get());

		 }
	}


