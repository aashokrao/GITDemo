package javaBasics;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("I am in Default Constrcutor");
	}
	
	public ConstructorDemo(int a, int b) {
		System.out.println("I am in parameterized Constrcutor");
		System.out.println(a+b);
	}
	
	public ConstructorDemo(String str) {
		System.out.println("I am in parameterized Constrcutor1");
		System.out.println(str);
	}

	public void getData() {
		System.out.println("I am in Method");
	}
	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo("Hello ASHOK") ;
		
				

	}

}
