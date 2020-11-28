package com.sk.logical;
//Not complete yet...Dont execute it

import java.util.Scanner;

public class ArmstrongNoAnyDigit {
	static int pow(int rr, int cc) {
	
		int op = 0;

		while(cc!=0)
		{
			cc--;
			op = op + rr*rr*rr;
		
	}
		
		System.out.println("____________________"+op);
		return op;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = scn.nextInt();
		int c = 0, r, m, rev = 0;
		m = n;
		while (n != 0) {
			n = n / 10;
			c++;
		}
		System.out.println("Count=" + c);
		n = m;
		while (m != 0) {

			r = m % 10;
			rev = rev + pow(r, c);
			m = m / 10;
		}
		if (n == rev)
			System.out.println("It is armstrong no");
		else
			System.out.println("not a armstrong no");
	}

}
