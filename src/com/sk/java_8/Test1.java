package com.sk.java_8;

/*
 * interface intf1 { public void m1(int x, int y); }
 * 
 * class demo1 implements intf1 {
 * 
 * @Override public void m1(int x, int y) { System.out.println(x + y); } }
 * 
 * public class Test1 {
 * 
 * public static void main(String[] args) { intf1 i = new demo1(); i.m1(20, 10);
 * }
 * 
 * }
 */
//above code using lambda exp.

interface intf1 {
	public void m1(int x, int y);
}

public class Test1 {

	public static void main(String[] args) {
		intf1 i = (x, y) -> System.out.println(x + y);
		i.m1(20, 10);
	}

}
