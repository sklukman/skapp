package com.sk.java_8;

/*
 * interface intf{ void m1(); public class demo implements intf{ public void
 * m1() { System.out.println("m1() is called"); } } }
 * 
 * public class Test{ public static void main(String[] args) { intf i=new
 * demo(); i.m1();
 * 
 * } }
 * 
 */

//above code by using java8 lambda exp.
interface intf {
	void m1();
}
public class Test {
	public static void main(String[] args) {
		intf i = () -> System.out.println("m1() called");
		i.m1();

	}
}