package com.nt.core;
 class test{
private	test()
	{
		
		System.out.println("super class constructor");
	}
test(int a)
{}
}
public class Example extends test {

	

	

public Example() {
	super(0);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Example e=new Example();

	}

}
