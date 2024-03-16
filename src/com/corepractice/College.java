package com.corepractice;

public class College {

	
	public String principleName() {
	return "kapoor";
	
	}
	
	public String collegeName() {
		return"RTMNU";
		
	}

}
class Principle extends College{
	public String universityName() {
		return "nagpur";
	}
	public static void main(String[] args) {
		
		College c=new College();
		c.collegeName();
		c.principleName();
		System.out.println(c.collegeName()+"  "+c.principleName());
		Principle p=new Principle();
		p.universityName();
		System.out.println(p.universityName());
	}
	
}