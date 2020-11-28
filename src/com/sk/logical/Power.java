package com.sk.logical;

public class Power {



	static int pwr(int N, int P) {
		
			return N * power(N, P - 1);
	}
	
	  static int power(int N, int P) 
	    { 
	        int pow = 1; 
	        for (int i = 1; i <= P; i++) 
	            pow *= N; 
	        return pow; 
	    } 
	
	public static void main(String[] args) {

		int N = 2;
		int P = 8;

		System.out.println(pwr(N,P));
	}
}