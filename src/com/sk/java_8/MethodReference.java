package com.sk.java_8;

/*
 * public class MethodReference {
 * 
 * public static void main(String[] args) {
 * 
 * Runnable r = () -> { for (int i = 0; i <= 5; i++)
 * System.out.println("chiled Thread"); };
 * 
 * Thread t = new Thread(r); t.start(); for (int i = 0; i <= 5; i++) {
 * System.out.println("Main Thread"); } } }
 */

//with static method
/*
 * public class MethodReference {
 * 
 * public static void run() { for (int i = 0; i <= 5; i++)
 * System.out.println("chiled Thread"); }
 * 
 * public static void main(String[] args) {
 * 
 * Runnable r = MethodReference::run;
 * 
 * Thread t = new Thread(r); t.start(); for (int i = 0; i <= 5; i++) {
 * System.out.println("Main Thread"); } } }
 */
/*
 * //with non-static method public class MethodReference {
 * 
 * public void run() { for (int i = 0; i <= 5; i++)
 * System.out.println("chiled Thread"); }
 * 
 * public static void main(String[] args) { MethodReference m = new
 * MethodReference(); Runnable r = m::run; Thread t = new Thread(r); t.start();
 * for (int i = 0; i <= 5; i++) { System.out.println("Main Thread"); } } }
 */
interface Interf {

	public void m1(int i);
}

class MethodReference {

	public void m2(int i) {
		System.out.println("From Method Reference:" + i);
	}

	public static void main(String[] args) {
		Interf f = I -> System.out.println("From Lambda Expression:" + I);
		f.m1(10);
		MethodReference t = new MethodReference();
		Interf i1 = t::m2;
		i1.m1(20);
	}
}
