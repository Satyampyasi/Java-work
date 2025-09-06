package Method_overiding;

public class Person {

	public static void main(String[] args) {
		
		A a = new B();
		
		a.m1();
		
 
	}

}

class A {
	
 static 	void m1() {
		System.out.println(" A excuted ");
	}
	
}

  class B extends A{
	static void m1() {
		System.out.println(" B class excuted ");
	}
	
	
}