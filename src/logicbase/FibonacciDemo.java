package logicbase;

public class FibonacciDemo {

	public static void main(String[] args) {
		int a=0, b=1;
		int c;
		for(int i=1; i<=10; i++)
		{
			c=a+b;
			System.out.print(  "   "+c);
			a=b;
			b=c;
			
			
		}

	}

}




//new change