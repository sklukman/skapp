package com.sk.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map<String, List<Integer>> m = new Hashtable();
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(98);
		l1.add(97);
		l1.add(95);
		l1.add(94);
		l1.add(93);
		l2.add(89);
		l2.add(88);
		l2.add(86);
		l2.add(85);
		l2.add(82);
		// convert list into map
		m.put("sk", l1);
		m.put("bk", l2);
		// to get all values from map we have convert into set
		Collection set = m.values();

		Iterator it = set.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}
	}
}