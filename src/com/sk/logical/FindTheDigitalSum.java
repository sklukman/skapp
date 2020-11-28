package com.sk.logical;
import java.util.Scanner;
public class FindTheDigitalSum {
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = scn.nextInt();
		int s = 0, r;
		while (n != 0) {
			r = n % 10;
			s = s + r;
			n = n / 10;
		}
		System.out.println("Digital Sum=" + s);
		}
}
