package com.sk.collection;

import java.util.LinkedList;

public class LIstIterator {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("Lukman");
		li.add("wasim");
		li.add("ravi");
		li.add("ram");
		li.add("rahul");
		System.out.println(li);
		java.util.ListIterator itr = li.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("ram")) {
				itr.remove();
			} else if (s.equals("wasim")) {
				itr.add("Allen");
			}
		}
		System.out.println(li);
	}

}
