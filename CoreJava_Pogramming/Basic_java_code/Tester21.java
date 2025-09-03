import java.util.Scanner;
class employee{
    private String firstname;
    private String lastname;
    private int empid;
    private double salary;
    private int noOfProject;

    public void calculatesal(){
      if (noOfProject > 5 && noOfProject < 11) {
        this.salary += 5000;
    }
    else if (noOfProject > 10 && noOfProject < 21) {
        this.salary += 10000;
    }
    else if (noOfProject > 20) {
        this.salary += 15000;
    }
        
    }
    employee( String firstname, String lastname,int empid,double salary,int noOfProject){
                this.firstname=firstname;
                this.lastname=lastname;
                this.empid=empid;
                this.salary=salary;
                this.noOfProject=noOfProject;
    }
    public String display(){
    return "First name "+firstname+"\n Last name "+lastname+"\n salary"+salary+" empid"+empid+"\n no of project"+noOfProject;
    }

}

public class Tester21 {
           public static void main(String[] args){

           Scanner sc = new Scanner( System.in);
           System.err.println("Enter first name:");
           String fn = sc.nextLine();
           System.err.println("Last first name:");
           String ln = sc.nextLine();
           System.err.println("EmployeeID:");
           int empid = sc.nextInt();
           System.err.println("EmployeeSalary:");
           double sal = sc.nextDouble();
           System.err.println("Enter no of:");
           int noOfProject= sc.nextInt();
           employee f1 = new  employee(fn, ln, empid, sal, noOfProject);

           f1.calculatesal();
           System.out.println(f1.display());

     }
     
}
