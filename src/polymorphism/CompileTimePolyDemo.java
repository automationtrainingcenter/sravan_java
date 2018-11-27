package polymorphism;

public class CompileTimePolyDemo {
	
	public void methodOne(String a, int b) {
		int ia = Integer.parseInt(a);
		System.out.println(ia+b);
	}
	
//	change in number of arguments
	public void methodOne(String a, int b, int c) {
		int ia = Integer.parseInt(a);
		System.out.println(ia+b+c);
	}
	
//	change in type of arguments
	public void methodOne(int a, int b) {
		System.out.println(a+b);
	}
	
//	change in sequence of arguments
	public void methodOne(int a, String b) {
		int ib = Integer.parseInt(b);
		System.out.println(a+ib);
	}
	
//	public int methodOne(String a, int b) {
//		
//	}
	
	

}
