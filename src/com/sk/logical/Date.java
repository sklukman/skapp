package com.sk.logical;
public class Date {
int month;
int day;
int year;
	public Date(int month,int day,int year) {
		this.month=month;
		this.day=day;
		this.year=year;	
		
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		 this.month = month;
	}
	public int getDay() {
		return day;
	}
	public int setDay(int day) {
		return this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int setYear(int year) {
		return this.year = year;
			}
	
	public static void main(String[] args) {
		Date d=new Date(5,1,2020);
	d.setMonth(d.month);	
		System.out.println(d.getMonth());
		//System.out.println(d.month+"/"+d.day+"/"+d.year);
		
	}
}
