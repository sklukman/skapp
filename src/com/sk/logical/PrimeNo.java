package com.sk.logical;
import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		int c = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;
		}
		if (c == 2)
			System.out.println("It is perfect no");
		else
			System.out.println("It is not perfect no");
	}
}