package basics;

import accessmodifiers.AccessModifiers;

public class ProtectedVariable extends AccessModifiers{
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.pVar);
//		System.out.println(obj.dVar);
//		System.out.println(obj.proVar);
		
		ProtectedVariable cobj = new ProtectedVariable();
		System.out.println(cobj.pVar);
//		System.out.println(cobj.dVar);
		System.out.println(cobj.proVar);
		
	}


}
