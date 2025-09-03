package Array_list;

import java.util.ArrayList;
import java.util.List;

class Students {
 private String name;
 private double gpa;
public Students(String name, double gpa) {
	super();
	this.name = name;
	this.gpa = gpa;
}
 public String getName() {
	 return name ;
 }
 public double getGpa() {
	 return gpa;
 }
}



public class Student {
	public static void main(String[] args) {
		List<Students> stu =  new ArrayList<>();
		
		Students s1 = new Students("karan", 2.5);
		stu.add(new Students( "satyam",3.8));
		stu.add( new Students("Arun",4.2));
		stu.add(s1);
		stu.sort((o1,o2)->{
			if(o2.getGpa()-o1.getGpa()>0) {
				return 1;
			}
			else if(o2.getGpa()-o1.getGpa()<0) {
				return 0;
			}
			else return 0;
		});
		for(Students s : stu) {
			System.out.println(s.getName()+"  "+s.getGpa());
		}
		
	}
	
}