package logicbase;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList<String> ar= new ArrayList<>();
		ar.add("abhay");
		ar.add("ashu");
		ar.add("ommy");
		ar.add("golu");

		System.out.println(ar);
		ar.remove("ashu");
		System.out.println(ar);
		//ar.clear();
		//System.out.println(ar);
		ar.size();
		System.out.println(ar.size());
	 
		
	}

}
