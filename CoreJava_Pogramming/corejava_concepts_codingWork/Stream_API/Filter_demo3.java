package Stream_API;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;


record    Person( int  id, String name , double salary){}

public class Filter_demo3 {

	public static void main(String[] args) {
		
		Person p1 = new Person(101, " satyam",25000);
		Person p2 = new Person(102, " katyam",35000);
		Person p3 = new Person(103, " patyam",45000);
		Person p4 = new Person(104, " Datyam",55000);
		Person p5 = new Person(105, " Hatyam",65000);
		
	 Stream<Person> PersonInfo = Stream.of(p1,p2,p3,p4,p5);
	 
	  List<Person>  expert =   PersonInfo.filter(emp->emp.salary()>50000).collect(Collectors.toList());
	  System.out.println(expert);
		

	}

}
