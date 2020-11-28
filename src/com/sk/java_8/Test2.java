package com.sk.java_8;
/*
 * interface intf2 { int m1(int x); }
 * 
 * class demo implements intf2 {
 * 
 * @Override public int m1(int x) { return x * x; } }
 * 
 * public class Test2 { public static void main(String[] args) { intf2 i = new
 * demo(); System.out.println(i.m1(5)); } }
 */

//with lamda exp.

interface intf2 {
	int m1(int x);
}
public class Test2 {
	public static void main(String[] args) {
		intf2 i = (x) -> x * x;
		System.out.println(i.m1(5));
	}
}
