package com.sk.logical;

import java.util.Scanner;

public class PrintingTable {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = scn.nextInt();
		int i, r = 2;
		for (i = 1; i <= n; i++) {
			System.out.println(r + "*" + i + "=" + r * i);
		}
	}

}
