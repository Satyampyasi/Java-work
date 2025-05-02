public class Student {
   int rollno;
   String name;
   char grade;
    Student(int rollno,String name,char grade){
    	this.rollno=rollno;
    	this.name=name;
    	this.grade=grade;
    }
    @Override
    public String toString() {
    	return "Student[Rollno="+rollno+",Name="+name+",Grade="+grade+"]";
    }
    public static void main(String[] args) {
    	Student s1 = new Student(45,"satyam",'A'); 
    	System.out.println(s1);
    }
}
