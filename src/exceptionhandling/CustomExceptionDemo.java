package exceptionhandling;

public class CustomExceptionDemo {
	
	public static boolean validataAge(int age) {
		if(age>=18) {
			return true;
		}else {
			throw new InvalidAgeException();
		}
	}

	public static void main(String[] args) {
		
		try {
			System.out.println(validataAge(17));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
