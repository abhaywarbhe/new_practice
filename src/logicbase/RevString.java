package logicbase;

public class RevString {

	public static void main(String[] args) {

		String st= "abhay";
		String rev=" ";
		int len= st.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+st.charAt(i);
		}
		
		System.out.println(rev);
	}

}
