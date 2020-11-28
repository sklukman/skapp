package com.sk.java_8;

/*
 * //with AnonymousInnerClass public class AnonymousInnerClass {
 * 
 * public static void main(String[] args) {
 * 
 * Thread t = new Thread(new Runnable() {
 * 
 * @Override public void run() { for (int i = 1; i <= 5; i++) {
 * System.out.println("Chiled Thread"); } } }); t.start(); for (int i = 1; i <=
 * 5; i++) { System.out.println("Main Thread"); } }
 * 
 * }
 */
//above exa. with lambda exp.
public class AnonymousInnerClass {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Chiled Thread");
			}
		});

		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread");
		}
	}

}
