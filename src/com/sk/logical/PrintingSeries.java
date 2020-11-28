package com.sk.logical;

import java.util.Scanner;
//print this series--------------  1+2+3+4+5=15
public class PrintingSeries {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = scn.nextInt();
int s=0;
for(int i=1;i<=n;i++)
{
	if(i==n)
	{
		System.out.print(i);
	}
	else {
	System.out.print(i+"+");
	}
	s+=i;
	}	
System.out.print("="+s);
	}

}
