package com.sk.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Sorting_HashMap_UsingComparator {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(8, "lukman");
		h.put(9, "mohammad");
		h.put(2, "arpita");
		h.put(6, "neha");
		h.put(3, "shaikh");
//convert map into set
		Set<Entry<Integer, String>> s = h.entrySet();
		// convert set into list
		List<Entry<Integer, String>> l = new ArrayList<Map.Entry<Integer, String>>(s);
		l.sort(new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return -o2.getValue().compareTo(o1.getValue());
				// return -1;desc
			}
		});
		System.out.println(l);
	}

}
