package com.sk.logical;

import java.util.Scanner;
// 6 is perfect no.-------------------  1+2+3=6
public class PerfectNo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no");
		int s = 0;
		int n = scn.nextInt();
		int m = n;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				s += i;		
			}
		if (m == s)
			System.out.println("It is perfect");
		else
			System.out.println("It is not perfect");
		}
}
