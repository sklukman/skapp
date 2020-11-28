package com.nt.core;

class B {
	private void m1() {
		System.out.println("It is super class  m1 method");
	}
	public void m2()
	{
		System.out.println("It is super class m2 method");
		m1();
	}
}

public class A extends B{
	public void m1() {
		System.out.println("It is sub class m1 a method");
	}

	public static void main(String[] args) {
		B a=new B();
	//	a.m1();
		//a.m2();

	}

}
