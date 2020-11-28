package com.sk.java_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {

		Predicate<Integer> p = I -> (I > 10);
		System.out.println(p.test(5));
		System.out.println(p.test(11));
		Predicate<String> p1 = s -> (s.length() > 3);
		System.out.println(p1.test("ravi"));
		System.out.println(p1.test("sk"));
		Predicate<Collection> p2 = c -> (c.isEmpty());
		Collection t = new ArrayList();
		//t.add(10);
		System.out.println(p2.test(t));
	}

}
