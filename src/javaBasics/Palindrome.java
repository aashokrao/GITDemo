package javaBasics;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s="Ashok";
		String t="";
		
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		System.out.println(t);
	
	if(t.equals(s)) {
		System.out.println("It's a Palindrome");
		System.out.println("It's a Palindrome1");
		System.out.println("It's a Palindrome2");
		System.out.println("It's a Palindrome3");
		//
		//
		System.out.println("It's a Palindrome4");
		System.out.println("It's a Palindrome5");
		System.out.println("It's a Palindrome6");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
}
}