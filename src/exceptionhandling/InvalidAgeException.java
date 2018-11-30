package exceptionhandling;

public class InvalidAgeException extends RuntimeException{

	public InvalidAgeException() {
		super("Age must be greater than 18");
	}

}
