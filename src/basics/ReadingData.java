package basics;

import java.util.Scanner;

/*
 * Scanner class is used to read the data from console
 * Create an object of Scanner class by passing System.in as in argument
 */
public class ReadingData {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
//		read an integer
		System.out.println("enter a number");
		int i = s.nextInt();
		System.out.println("enter i value is "+i);
//		read a float
		System.out.println("enter a float");
		float f = s.nextFloat();
		System.out.println("enter f value is "+f);
//		read a double
		System.out.println("enter a double value");
		double d = s.nextDouble();
		System.out.println("entered double value is "+d);
		
//		read a string
		System.out.println("enter your name");
		String name = s.next();
		System.out.println("hello "+name);
		
//		read a boolean
		System.out.println("enter a boolean data");
		boolean bool = s.nextBoolean();
		System.out.println("entered boolean value is "+bool);
		
		
	}

}
