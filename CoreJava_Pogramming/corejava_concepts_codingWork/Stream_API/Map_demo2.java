package Stream_API;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Employee( Integer id , String name, Double salary ) {
	
}

public class Map_demo2 {

	public static void main(String[] args) {
		ArrayList<Employee> listofEmp = new ArrayList<>();
		listofEmp.add(new Employee(1, "satyam",800D));
		listofEmp.add(new Employee(2,"karan",700D));
		listofEmp.add(new Employee(3,"vijay",800D));
		listofEmp.add(new Employee(4,"aran",600D));
		listofEmp.add(new Employee(5,"sanjay",500D));
		//Adding 500 to all the em-loyee who have salary lower than 700D 
		
	  List<String>  collect = 	listofEmp.stream()
		        .filter(emp->emp.salary()<700)
		                 .map(emp->emp+" Update Sal:"+(emp.salary()+500.0)).toList();
	  System.out.println(" Employee  data after Salary increament ");
	  collect.forEach(System.out::println);
	
	
		

	}

}
