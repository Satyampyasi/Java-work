package functionsl_programing;

import java.util.function.Predicate;

@FunctionalInterface
interface dkbhos{
	String prepair(double val);
}

class Employ {
String name;
int age;
double salary;
public Employ(String name, int age, double salary) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employees [name=" + name + ", age=" + age + ", salary=" + salary + "]";
}
public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public double getSalary() {
	return salary;
}

}
class Employees{
	public static void display(Employ emp[],Predicate<Integer> p) {
		for(Employ e:emp) {
			int age = e.getAge();
			if(p.test(age)) System.out.println(e);
		}
	}
	public static void displaysal(Employ emp[],dkbhos d) {
		for(Employ e: emp) {
			double sal = e.getSalary();
			String Result = d.prepair(sal);
			System.out.println(e+"-"+Result);
		}
	}
	
public static void main(String[] args) {
	Employ  e1 = new Employ("satyam",22,25000);
	Employ  e2 = new Employ("Lalit",32,55000);
	Employ  e3 = new Employ("sarma",42,65000);
	Employ  e4 = new Employ("gagan",52,50000);
	Employ Emp[] = { e1,e2,e3,e4};
	display(Emp,(age)->{
		if(age>35) return true;
		else return false;
	});
	System.out.println("********************************************************************************");
	displaysal(Emp,(sal)->{
		if(sal>=50000) return  "high salary ";
		else return "";
	});
	
}
}