package exceptionhandling;

public class RuntimeExceptionDemo {
	public static void main(String[] args) {
		int i =10;
		try {
			System.out.println(i/0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		String name = "sravan";
		try {
			System.out.println(name.charAt(9));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("executes always");
		}
		
	}

}
