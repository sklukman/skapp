package com.sk.collection;

import java.util.LinkedHashSet;

public class HashSetD {

	public static void main(String[] args) {
		// HashSet hs = new HashSet();//insertion order is not preserved
		LinkedHashSet hs = new LinkedHashSet();// insertion order is preserved
		hs.add(null);
		hs.add("SK");
		hs.add("PK");
		hs.add("BK");
		hs.add("HK");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.add("SK"));
		System.out.println(hs.add(null));
		System.out.println(hs.add("SP"));
	}

}
