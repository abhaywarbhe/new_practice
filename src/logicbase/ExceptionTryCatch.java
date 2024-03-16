package logicbase;

public class ExceptionTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int divide =5/0;
}

catch (ArithmeticException e) {
	System.out.println("Arithmeric Exception handled"+e.getMessage());
}
finally {
	System.out.println("this is finally block");
}
	}

}
