package com.sk.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayList_To_Array {

	public static void main(String[] args) {
		ArrayList<String> ai = new ArrayList<String>();
		ai.add("a");
		ai.add("c");
		ai.add("k");
		ai.add("p");
		ai.add("s");
		// convert list to array
		String[] s = ai.toArray(new String[ai.size()]);
		System.out.println(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		// converting array to list
		List l = Arrays.asList(s);
		System.out.println(l);
	}
}
