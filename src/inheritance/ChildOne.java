package inheritance;

public class ChildOne extends Parent{
	
	public ChildOne() {
		super();
		System.out.println("childOne object created");
	}
	
	public void childOneMethod() {
//		parentMethod();
		System.out.println("hello from child one");
	}

}
