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
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
}
}