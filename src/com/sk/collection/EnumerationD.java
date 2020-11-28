package com.sk.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationD {

	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Integer I = (Integer) e.nextElement();
			if(I%2==0)System.out.println(I);
		}
	}

}
