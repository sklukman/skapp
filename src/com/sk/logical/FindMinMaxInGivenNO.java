package com.sk.logical;

import java.util.Scanner;

public class FindMinMaxInGivenNO {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=scn.nextInt();
		int max=-9,min=9,r;
		while(n!=0)
		{
			r=n%10;
			if(r>max)max=r;
			if(r<min)min=r;
		n=n/10;
		}
System.out.println("MAX="+max);
System.out.println("MIN="+min);
	}

}
