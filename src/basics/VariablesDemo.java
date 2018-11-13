package basics;
/*
 * local variable: variable which is declared inside a method
 * instance variable: variable which is declared in class and outside any method.
 * we can access these variables by creating an object of the class. These are object level
 * static variable: same as instance variables but declared using static keyword
 * we can access using class name. These are class level
 * */


public class VariablesDemo {
//	instance variable
	int i = 10;
	
//	static variable
	static int s = 20;
	
	public void localMethod() {
		int l = 30;
		System.out.println("local variable is "+l);
	}
	
	public static void main(String[] args) {
//		create an object to access instance variables
		VariablesDemo obj = new VariablesDemo();
		System.out.println("instance variable is "+obj.i);
		System.out.println("static variable is "+VariablesDemo.s);
		obj.localMethod();
	}


}
