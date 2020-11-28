package com.sk.collection;

import java.util.Vector;

public class VectorD {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i = 1; i <= v.capacity(); i++) {
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement("sk");
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
