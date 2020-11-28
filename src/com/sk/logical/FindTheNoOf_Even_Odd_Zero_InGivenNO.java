package com.sk.logical;

import java.util.Scanner;

public class FindTheNoOf_Even_Odd_Zero_InGivenNO {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a nO");
		int n = scn.nextInt();
		int odd = 0, even = 0, zero = 0, r;
		while (n != 0) {
			r = n % 10;
			if (r == 0) {
				zero++;
			} else if (r % 2 == 0) {
				even++;
			} else if (r % 2 == 1) {
				odd++;
			}
			n /= 10;
		}
		System.out.println("Zero=" + zero);
		System.out.println("even=" + even);
		System.out.println("odd=" + odd);
	}

}
