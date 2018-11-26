package inheritance;
/*
 * Inheritance means acquiring the properties and behavior (methods) of one class (parent or super or base)in 
 * another class (child or sub). The main advantage of Inheritance is code re-usability
 * 
 * There are 5 types of inheritance in Java
 * 
 * single: single parent and single child. A -> B
 * multilevel: parent and child and sub child. A->B->C
 * Hierarchical: single parent and multiple child. A->B A->C
 * multiple: multiple parent and single child. A->C B->C
 * Hybrid: combination hierarchical and multiple. 
 * 
 * 
 * multiple and hybrid inheritance is not possible directly in Java.
 * 
 * Inside the child class we can access Parent class properties and methods directly and outside the child class
 * By creating a child class object we can access parent class properties and methods
 * 
 * To achieve inheritance we have to use extends keyword
 * 
 * child class extends parent class
 * 
 * super keyword always represents the parent class instance.
 */

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
//		single inheritance
		ChildOne cObj = new ChildOne();
		cObj.childOneMethod();
		cObj.parentMethod();
		
		
//		multi level inheritance
		SubChild sObj = new SubChild();
		sObj.subChildMethod();
		sObj.childOneMethod(); // ChildOne class method
		sObj.parentMethod(); //Parent class method
		
//		Hierarchical
		ChildTwo c2Obj = new ChildTwo();
		c2Obj.childTwoMethod();
		c2Obj.parentMethod();
		
		Parent obj = new Parent();
		obj.parentMethod();
		
		Parent pObj = new ChildOne();
		pObj.parentMethod();
		ChildOne co = (ChildOne) pObj;
		co.childOneMethod();
		
		Parent paObj = new SubChild();
		paObj.parentMethod();
		SubChild sc = (SubChild)paObj;
		sc.childOneMethod();
		sc.subChildMethod();
		
		
	}

}
