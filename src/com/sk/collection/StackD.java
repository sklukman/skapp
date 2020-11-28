package com.sk.collection;

import java.util.Stack;

public class StackD {

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push("A");
		s.push("C");
		s.push("B");
		s.push("D");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("k"));

	}

}
