package MethodReference_work;

interface  Developer{
	void work(double salary);
}



public class Method_ref_Demo3 {

	public static void main(String[] args) {
		
		 Developer d1 = Manager::getSalary;
		 d1.work(2500);
	}
	  
	   
	
	
}

class Manager{
	public  static void  getSalary(double salary) {
		System.out.println(" Manager salary is :"+salary);
	}
}
// Here a Parameter type and method return type both are Compulsary