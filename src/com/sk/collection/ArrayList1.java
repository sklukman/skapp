package com.sk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Object> ai = new ArrayList<Object>();
		ai.add("sk");
		ai.add(1);
		ai.add("pk");
		ai.add(10);
		System.out.println(ai);
		ListIterator it = ai.listIterator();
		int c = 1;
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof String) {
				String s = o.toString();
				it.set(s.toUpperCase());
			}
			if (o instanceof Integer) {
				Integer i = (Integer) o;
				if (c == i) {
					it.set(20);
				}
				System.out.println(ai);
			}
		}
		System.out.println(ai);
		while (it.hasPrevious()) {
			Object o1 = it.previous();
			System.out.println(o1);
		}
		System.out.println(ai);
	}
}
