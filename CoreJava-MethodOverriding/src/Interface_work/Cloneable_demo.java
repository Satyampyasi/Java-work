package Interface_work;


class Student_info implements Cloneable{
	int age;
	String name;
	public Student_info(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	 public Object clone() throws CloneNotSupportedException {
		 return super.clone();
	 }
}
public class Cloneable_demo {
public static void main(String[] args) throws CloneNotSupportedException {
	Student_info s1 = new Student_info(23,"ramu");
	Student_info  s2 = (Student_info)s1.clone();
	System.out.println( s1.age +"  " +s2.age+"  "+s1.name+"  "+s1.name);
}
}
