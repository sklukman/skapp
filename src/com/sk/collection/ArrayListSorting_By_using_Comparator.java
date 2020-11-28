package com.sk.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSorting_By_using_Comparator {

	public static void main(String[] args) {
	List<Integer> ai = new ArrayList();
		ai.add(87);
		ai.add(10);
		ai.add(20);
		ai.add(40);
		ai.add(30);
		ai.add(60);
		ai.sort((obj1, obj2) ->  obj2.compareTo(obj1));
	       System.out.println(ai);

	}

}
/*
 * class MY implements Comparator<Integer>{
 * 
 * @Override public int compare(Integer obj1, Integer obj2) { return
 * obj1.compareTo(obj2); } }
 */	
