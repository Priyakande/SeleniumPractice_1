package Java8_Practice;

import com.google.common.base.Function;

public class FunctionChainDemo {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f1 = i-> i*2;
		Function<Integer,Integer> f2 = i-> i*i*i;
		
		//andThen : f1 execute first and then f2 excecutes with result of f1
		System.out.println(f1.andThen(f2).apply(2));
		
		//andThen : f2 execute first and then f1 executes with result of f2
		System.out.println(f1.compose(f2).apply(2));
		


	}

}
