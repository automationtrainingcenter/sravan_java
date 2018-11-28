package abstraction;

public interface InterfaceDemo {
	int a = 10;
	
	void methodOne();
	void methodTwo();
	void methodThree();
	
//	default methods in interface from Java 8
	default void defaultMethod() {
		System.out.println("this is defalut method of interface");
	}
	
//	static method
	static void staticMethod() {
		System.out.println("static method of interface");
	}

}
