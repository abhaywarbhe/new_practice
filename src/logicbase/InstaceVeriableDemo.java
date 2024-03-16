package logicbase;

public class InstaceVeriableDemo {

	public String name;
	private int age;
	String division;
	
	public InstaceVeriableDemo (String sname) {
		name=sname;
	}
	public void setAge(int sage) {
		age=sage;
	}
	public void setDiv(String sdiv) {
		division=sdiv;
	}
	
	public void printstud() {
		System.out.println("student name:"+name);
		System.out.println("student age:"+age);
		System.out.println("student division:"+division);
	}
	public static void main(String[] args) {
		
		InstaceVeriableDemo ivd=new InstaceVeriableDemo("ashu");
		ivd.setAge(25);
		ivd.setDiv("B");
		ivd.printstud();
	}
	
	
}
