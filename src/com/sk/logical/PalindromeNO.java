package com.sk.logical;

import java.util.Scanner;

public class PalindromeNO {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n = scn.nextInt();
		int rev = 0, r, m;
		m = n;
		while (n != 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if (m == rev)
			System.out.println("It is palindrom no");
		else
			System.out.println("Not a palindrom no");
	}

}
