package com.sk.logical;
//153, 1 to 9 , 1634 it is all armstrong no. 
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=scn.nextInt();
		int r,rev=0,m;
		m=n;
		while(n!=0)
		{
			r=n%10;
		rev=rev+r*r*r;
		n=n/10;
		}
if(rev==m)System.out.println("It is Armstrong no");
else System.out.println("It is not a Armstrong no");
	}

}
