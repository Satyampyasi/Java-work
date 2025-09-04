package MethodReference_work;


interface Workers{
	void work();
}



public class Mthod_ref_Demo2 {
	public static void main(String[] args) {
		Workers w1  = Employees::work;
		w1.work();
		
		Worker w2 = ()->System.out.println(" worker is working");
		w2.work();
		
		Worker w3 = ()-> Employees.work();
		w3.work();
		
	}

}

class Employees{
	public static  void work() {
		System.out.println(" Employee is working: ");
	}
}