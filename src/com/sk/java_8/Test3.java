package com.sk.java_8;

/*
 * class MyRunnable implements Runnable {
 * 
 * @Override public void run() { for (int i = 0; i <= 5; i++) {
 * System.out.println("chiled Thread"); } } }
 * 
 * public class Test3 { public static void main(String[] args) {
 * 
 * Runnable r = new MyRunnable(); Thread t = new Thread(r); t.start(); for (int
 * i = 0; i <= 5; i++) { System.out.println("Main Thread"); } } }
 */

public class Test3 {
	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i <= 5; i++)
				System.out.println("chiled Thread");
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("Main Thread");
		}
	}
}
