package com.corepractice;

public class OverloadingDemo1 {
	
	public void kubrie(String name) {
		System.out.println("1st method "+name);
		
			}
	
	public void kubrie(int no) {
		System.out.println("2nd method"+"  "+no);
		
	}
	
	public void kubrie(double salary) {
		System.out.println("3rd method "+salary);

	}
	
	public static void main(String[] args) {
		
		OverloadingDemo1 od=new OverloadingDemo1();
		
		od.kubrie(99.22);
	}
}
