package Optional_class_demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

record Student(String name, int age) {
	
}

public class Find_minimum {
public static void main(String[] args) {
//
//	List<Student> list = new ArrayList<>();
//	list.add(new Student("karan",25));
//	list.add(new Student("Ajaye",12));
//	list.add(new Student("satyam",22));
//	
//	 Optional<Student>  young = list.stream().min(Comparator.comparingInt(Student::age));
//	 System.out.println(young);
//	 
      List<Integer> numbers = Arrays.asList(1,5,8,6,4);
      Optional<Integer> small = numbers.stream().min(Integer::compare);
      
      small.ifPresent(System.out::println);
	

}
}
