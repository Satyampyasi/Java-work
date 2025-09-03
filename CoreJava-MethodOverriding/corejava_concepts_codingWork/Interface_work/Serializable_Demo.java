package Interface_work;


import java.io.*;

class Student implements Serializable{
	
	int age ;
	String name;
	Student (int age , String name){
		this.name = name;
		this.age = age;
	}
}


public class Serializable_Demo {
	public static void main(String[] args) throws Exception  {
		Student s1 = new Student(22,"satyam");
		
		// serialization is a process of converting object into byte Stream
		FileOutputStream fos = new FileOutputStream("Student.txt");
		ObjectOutputStream  oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.close();
		
		// Deserialization
		FileInputStream fis = new FileInputStream("Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s2  = (Student)ois.readObject();
		 System.out.println(" Age  ="+s1.age+"  Name: "+s1.name);
		
		
		

	}

	}
