package javaBasics;

public class ExceptionCatch {

	public static void main(String[] args) {
		int a,b,c;
		a=5;
		c=0;
		
		try {
			b=a/c;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("toString(): "  + e.toString());
	         System.out.println("getMessage(): " + e.getMessage());
	         System.out.println("StackTrace: ");
	         e.printStackTrace();
		}
	}
}
