package com.corepractice;

public class AnythingDemo {
	
	public void m1(String s1) {
		System.out.println("with void"+" "+s1);
		
	}
	
	public  String m1() {
		return "abhay";
	}
	
	public static void main(String[] args) {
		
		AnythingDemo a=new AnythingDemo();
		a.m1("ashu");
		
		System.out.println(a.m1());
	}
	

}
