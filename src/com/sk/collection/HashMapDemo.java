package com.sk.collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(200, "sk");
		m.put(100, "pk");
		m.put(300, "dk");
		m.put(5000, "hk");
		m.put(150, "bk");
		System.out.println(m);
		System.out.println(m.put(108, "rk"));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator it = s1.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();

			System.out.println(e.getKey() + "--------" + e.getValue());
			if (e.getValue().equals("hk")) {
				e.setValue("HK");
			}
			System.out.println(m);
		}

	}

}
