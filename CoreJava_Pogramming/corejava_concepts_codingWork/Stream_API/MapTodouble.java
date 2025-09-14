package Stream_API;

import java.util.stream.Stream;
record  Emp( String name,Integer exp) {
	
}
public class MapTodouble {

	public static void main(String[] args) {
		Emp e1 = new Emp("satyam",12);
		Emp e2 = new Emp("Karan",15);
		Emp e3 = new Emp("Ajay",14);
		Emp e4= new Emp("ramesh",92);
		Emp e5 = new Emp("kashu",52);
		int tottal=  Stream.of(e1,e2,e3,e4,e5)
	       .mapToInt(emp->emp.exp()).sum();
		
		System.out.println("Total Exp: "+tottal);
	         

	}

}
