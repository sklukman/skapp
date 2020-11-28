package com.sk.logical;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
System.out.println("Enter a no.");
int n=scn.nextInt();
int rev=0,r;
while(n!=0)
{	r=n%10;
	rev=rev*10+r;
	n=n/10;
	}
System.out.println("Reverse is:: "+rev);
	} 
}
