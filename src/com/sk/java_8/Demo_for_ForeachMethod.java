package com.sk.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Demo_for_ForeachMethod {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
		// using simple for loop
		/*
		 * for(int i=0;i<l.size();i++) { System.out.println(l.get(i)); }
		 */
		/*
		 * // using foreach loop for (int x : l) { System.out.println(x); }
		 */
//using foreach method of java8
		l.forEach(i -> System.out.println(i));

		l.forEach(System.out::println);
	}
}
