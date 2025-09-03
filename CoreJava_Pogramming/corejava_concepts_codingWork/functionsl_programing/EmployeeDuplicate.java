package functionsl_programing;

public class EmployeeDuplicate {
	private int id;
	private String name;
	private double salary;

	public EmployeeDuplicate() {
		super();
		this.id = 00;
		this.name = "unknow";
		this.salary = 00;
	}

	public EmployeeDuplicate(int id, String name, double salary) {
		super();

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDuplicate [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		EmployeeDuplicate other = (EmployeeDuplicate) obj;
		return id == other.id;
	}

}
class Tester {
	public static void main(String[] args) {
		EmployeeDuplicate emp1 = new EmployeeDuplicate(1, "John", 50000);
        EmployeeDuplicate emp2 = new EmployeeDuplicate(2, "Jane", 60000);
        EmployeeDuplicate emp3 = new EmployeeDuplicate(1, "John", 50000); 
        
        System.out.println("Employee 1: " + emp1);
        System.out.println("Employee 2: " + emp2);
        System.out.println("Employee 3: " + emp3);
        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));         
	}
}

