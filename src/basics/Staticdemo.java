package basics;

public class Staticdemo {
	int i = 0;
	static int j = 0;
	
	public void increment() {
		System.out.println("i = "+(++i)+"\tj = "+(++j));
	}
	
	public static void main(String[] args) {
		Staticdemo obj1 = new Staticdemo();
		obj1.increment();
		Staticdemo obj2 = new Staticdemo();
		obj2.increment();
		Staticdemo obj3 = new Staticdemo();
		obj3.increment();
	}
}
