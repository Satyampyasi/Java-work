package MethodReference_work;

interface Worker{
	void work();
}



public class Method_ref_Demo1 {
public static void main(String[] args) {
	// Lamda Expresion 
	Worker w = ()->System.out.println(" worker is working");
	w.work();
	
	Worker w1=() -> new Employee().work();
	w1.work();
	
	Worker w2 = new Employee()::work;
	w2.work();
}



}

 class Employee{
	 
	 public void work() {
		 System.out.println(" Employee is working");
	 }
 }