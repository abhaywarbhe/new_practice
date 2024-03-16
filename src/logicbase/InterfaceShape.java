package logicbase;
//Interface is fully abstract class
public interface InterfaceShape {
    //abstract method
	void getArea(int lenght, int breadth);
	 
	
class Rectangle implements InterfaceShape {
		 
		 public void getArea(int lenght, int breadth) {
			 System.out.println("this is the area of rectangle :"+(lenght*breadth));
		 }
		 
		 
class Main {
		 public static void main(String[] args) {
			Rectangle r=new Rectangle();
			
			r.getArea(7, 8);
			}
		 }
		 
	 }
	
}
