package com.sk.java_8;

class Sample {
	private String s;

	Sample(String s) {
		this.s = s;
		System.out.println("Constructor Executed:" + s);
	}
}

interface Interfs {
	public Sample get(String s);
}

public class ConstructorReference {
	public static void main(String[] args) {
		Interfs f = s -> new Sample(s);
		f.get("From Lambda Expression");
		Interfs f1 = Sample::new;
		f1.get("From Constructor Reference");
	}
}
