package Optional_class_demo;

import java.util.Optional;

class Employee{
 private Integer id;
 private String name;
 
	public Employee() {
	super();
		
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Optional<Integer> getId(){
		return Optional.ofNullable(id);
	}

	public Optional<String> getname(){
		return Optional.ofNullable(name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}


public class Optional_demo2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(11, "satyam");
		Optional<String> name = e1.getname();
		
		System.out.println(name.orElse("Name is not available")); 
		
		Optional<Integer> id = e1.getId();
		id.ifPresent(value-> System.out.println("value is :"+value));
		id.ifPresent(System.out::println);
		
		
	
		
	}

}

























