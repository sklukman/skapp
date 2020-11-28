package com.sk.InnerClasses;


/*
 * public class Outer { class inner { public void method2() {
 * System.out.println("inner method call"); } }
 * 
 * public void method1() { inner in = new inner(); in.method2();
 * 
 * }
 * 
 * public static void main(String[] args) { Outer o = new Outer(); }
 * 
 * }
 */
/*
 * public class Outer { class inner { public void method2() {
 * System.out.println("inner method call"); } }
 * 
 * public static void main(String[] args) { Outer o = new Outer(); new
 * Outer().new inner().method2(); }
 * 
 * }
 */

  public class Outer { int x = 10;
  
  class inner { int x = 100;
  
  public void method2() { int x = 1000;
  System.out.println("inner method call"); System.out.println(x);
  System.out.println(this.x); System.out.println(Outer.this.x); } }
  
  public static void main(String[] args) { Outer o = new Outer(); new
  Outer().new inner().method2(); }
  
  }
 
/*
 * class Outer { class B { class C { public void m1() {
 * System.out.println("Method Called"); } } }
 * 
 * public static void main(String[] args) { Outer a=new Outer(); Outer.B b=new
 * a.B(); Outer.B.C c=new b.C(); c.m1(); } }
 */