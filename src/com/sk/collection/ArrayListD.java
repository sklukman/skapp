package com.sk.collection;

import java.util.ArrayList;

public class ArrayListD {

	public static void main(String[] args) {
		ArrayList ai = new ArrayList();
		ai.add(10);
		ai.add("sk");
		ai.add(10);
		ai.add(null);
		System.out.println(ai);
		ai.remove(2);
		System.out.println(ai);
		ai.add(1, "pk");
		ai.add("M");
		System.out.println(ai);
	}

}
