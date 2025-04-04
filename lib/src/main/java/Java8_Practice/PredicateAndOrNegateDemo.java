package Java8_Practice;

import com.google.common.base.Predicate;

public class PredicateAndOrNegateDemo {

	public static void main(String[] args) {
		int[] ar = { 0, 5, 10, 15, 20, 25, 30, 35 };
		Predicate<Integer> p1 = i -> i % 2 == 0; // Even numbers
		Predicate<Integer> p2 = i -> i > 10; // Greater than 10

		// and
		System.out.println("and predicate");
		for (int a : ar) {
			if(p1.and(p2).test(a))
			System.out.println(a);
		}
		// or
		System.out.println("or predicate");
		for (int a : ar) {
			if(p1.or(p2).test(a))
			System.out.println(a);
		}
		// Negate
		System.out.println("negate predicate");
		for (int a : ar) {
			if(p1.negate().test(a))
			System.out.println(a);
		}

	}

}
