public class Student {  // Changed class name (can't start with number)
int age;  // Instance variable (non-static)
    
    public void display() {  // Non-static method
        int age = 10;  // Local variable 
        System.out.println("Local age: " + age);
        System.out.println("Instance age: " +this.age);  // 'this' refers to instance variable
    }
    
    public static void main(String[] args) {  // Correct main method signature
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.age = 19;  // Setting instance variable for s1
        s2.age = 25;  // Setting instance variable for s2
        
        s1.display();
        s2.display();
    }
}