package exceptionhandling;

public class CompileTimeExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("line 1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("line 2");
	}

}
