package com.sk.jdbc;

import java.util.Date;

public class TESTDate {

	public static void main(String[] args) {
		java.util.Date d = new Date();
		long i = d.getTime();
		java.sql.Date d1 = new java.sql.Date(i);
		System.out.println(d);
		System.out.println(d1);
	}

}
