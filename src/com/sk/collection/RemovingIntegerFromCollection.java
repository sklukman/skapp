package com.sk.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemovingIntegerFromCollection {

	public static void main(String[] args) {
		LinkedHashSet<Object> lh = new LinkedHashSet<Object>();
		lh.add("sk");
		lh.add(100);
		lh.add("lukman");
		lh.add(new StringBuffer("hk"));
		lh.add(20);
		lh.add("shaikh");
		Iterator it = lh.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof String) {
				String s = ((String) o).toUpperCase();
				System.out.println(s);
			} else
				it.remove();

		}
		System.out.println(lh);
	}

}
