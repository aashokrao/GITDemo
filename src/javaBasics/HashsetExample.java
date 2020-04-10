package javaBasics;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("AA");
		hs.add("BB");
		hs.add("BB");
		hs.add("CC");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("AA"));
		hs.remove("BB");
		System.out.println(hs);
		System.out.println(hs.size());
	
		
		

	}

}
