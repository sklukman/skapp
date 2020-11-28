package com.sk.InnerClasses;

public class LocalOuter {

	void m1() {

		class Inner1 {
			void m2(int x, int y) {
				System.out.println(x + y);
			}

		}
		new Inner1().m2(1, 2);
	}

public static void main(String[] args) {

	 new LocalOuter().m1();
}
}