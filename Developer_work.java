import java.util.Scanner;

class Employee{
     int empNum;
     String EmpName;
     double Sal;
     Employee(int empNum, String EmpName, double Sal){
          this.empNum = empNum;
          this.EmpName = EmpName;
          this.Sal = Sal;
     }
       public void check(){
          if(Sal>=60000) System.out.println("developer");
          else if(Sal>=40000 && Sal <60000) System.out.println("Designer");
          else System.out.println("Tester");
       }

       public void display(){
          if(this.empNum<0){
           this.empNum=0;
           System.out.println();
           System.out.println("id must be always positive integer");
          }
            else {
                if( this.EmpName == ""){
                    System.out.println("name must initialize with any default name");
                   }
                   else{
                    if(this.Sal<0){
                         System.out.println(" salary can not be negative ");
                    }
                    else{
                         // System.out.println("Employee number is: "+this.empNum);
                         // System.out.println("Employee number is: "+this.EmpName);
                         // System.out.println("Salary of employee: "+this.Sal);
                         check();
                    }
                   }

               
          }
       
       }
}

public class Developer_work {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Emp name");
            String EmpName= sc.nextLine();
            System.out.println("Enter Employee id:");
            int Empid= sc.nextInt();
            System.out.println("Enter emp salary:");
            double Empsal=sc.nextDouble();
            Employee f1= new Employee(Empid, EmpName, Empsal);
            f1.display();
           
          }
}
