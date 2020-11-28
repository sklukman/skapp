package com.sk.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetString {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator1());
		t.add("sk");
		t.add("bk");
		t.add("hk");
		t.add("ck");
		t.add("pk");
		System.out.println(t);
	}
}

class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();

		return s2.compareTo(s1);
	}

}
