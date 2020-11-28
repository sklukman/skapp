package com.sk.logical;
import java.util.Scanner;
public class CountOneTo_N_No {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, c = 0;
		System.out.println("Enter a name");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n != 0){
			c++;
			n = n / 10;
		}
		System.out.println(c);
	}
}
