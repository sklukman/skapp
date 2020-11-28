package com.sk.java_8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Sample1 {
	public static void main(String[] args) {
		List<Info> l = new ArrayList();
		l.add(new Info("lukman", 22));
		l.add(new Info("ravi", 26));
		l.add(new Info("allen", 18));

		/*
		 * Iterator<Info> it=l.iterator(); while(it.hasNext()) { Object o=it.next();
		 * System.out.println(o.toString()); }
		 */

		l.forEach(System.out::println);
//		l.forEach(i -> System.out.println(i));

		/*
		 * for (Object o : l) { System.out.println(o.toString()); }
		 */ }
}
