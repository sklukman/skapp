package com.sk.collection;

import java.util.LinkedList;

public class LinkedListD {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("lukman");
		li.add(10);
		li.add(null);
		li.add("lukman");
		System.out.println(li);
		li.set(0, "ravi");
		System.out.println(li);
		li.add(0, "rahul");
		System.out.println(li);
		li.removeFirst();
		li.addFirst("sk");
		System.out.println(li);
	}
}
