package com.sk.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorD {

	public static void main(String[] args) {

		ArrayList ai = new ArrayList();
		/*
		 * ai.add("Lukman"); ai.add("Ravi"); ai.add("kiran"); ai.add("rahul");
		 * ai.add("harsh");
		 */
		for (int i = 0; i <= 10; i++) {
			ai.add(i);
		}
		Iterator it = ai.iterator();
		while (it.hasNext()) {
			Integer s = (Integer) it.next();
			if (s % 2 == 0)
				System.out.println(s);
			else
				it.remove();
		}
		System.out.println(ai);
	}
}
