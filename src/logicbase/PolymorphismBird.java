package logicbase;

public class PolymorphismBird {
     
	public void sing() {
		System.out.println("uuhuuuhuuuh....");
	}
}
	
	class Crow extends PolymorphismBird {
		public void sing() {
			System.out.println("cowcowcow...");
		}
	}
	
	class Peacock extends PolymorphismBird {
	  public void sing() {
		  System.out.println("piuuuupiuuupiuuu...");
	  }
	}
	class Main {
		public static void main(String[] args) {
		
			
			Crow ashu=new Crow();
			ashu.sing();
			Peacock p=new Peacock();
			p.sing();
		}
	}

