package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysLListExample {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ashok");
		a.add("Java");
		System.out.println(a);
		System.out.println(a.size());
		a.add(1, "Kumar");
		System.out.println(a);
		System.out.println(a.contains("Java"));
		System.out.println(a.get(1));
		System.out.println(a.indexOf("Kumar"));
		Iterator<String> aa = a.iterator();
		while(aa.hasNext()) {
			System.out.println(aa.toString());
		}
		

	}

}
