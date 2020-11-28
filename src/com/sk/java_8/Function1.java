package com.sk.java_8;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		Function<String,Integer> f=s->(s.length());
		System.out.println(f.apply("sk"));
		System.out.println(f.apply("lukman"));
	}

}
