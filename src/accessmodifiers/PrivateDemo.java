package accessmodifiers;

public class PrivateDemo {

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar);
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}

}
