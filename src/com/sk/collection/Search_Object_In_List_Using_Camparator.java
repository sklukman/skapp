package com.sk.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Search_Object_In_List_Using_Camparator {

	public static void main(String[] args) {
		ArrayList<Emp> ai = new ArrayList<Emp>();
		ai.add(new Emp(1, "shaikh", 100));
		ai.add(new Emp(2, "phatan", 200));
		ai.add(new Emp(1, "khan", 300));
		Emp s = new Emp(1, "shaikh", 100);
		System.out.println(s);
		int i = Collections.binarySearch(ai, s, new myCom());

		System.out.println(i);
	}

}
class myCom implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		if (o1 == o2) {
			return +1;
		} else
			return 0;
	}

}
