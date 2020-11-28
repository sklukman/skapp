package com.sk.logical;
public class SameNo {
	public static void main(String[] args) {
		int[] a = { 9, 3, 1, 2, 3, 7, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
