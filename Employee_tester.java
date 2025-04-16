import java.util.Scanner;

class Employee_work {
     private String  employeeName;
     private String  department;
     private double  basesalary;
     private int  perfromanceScore;
      public double calculateBonus( int perfromanceScore){
     if(perfromanceScore>=8 && perfromanceScore<=10) return basesalary*0.20;
      else if(perfromanceScore>=5 && perfromanceScore<=7) return basesalary*0.10;
      else if ( perfromanceScore<5) return basesalary;
      else return 0;
      }
      public void setperformance( int perfromanceScore){
          this.perfromanceScore = perfromanceScore;
      }
      public int getperformance() { return perfromanceScore;}


      public void setemployeeName(String employeeName){
            this.employeeName = employeeName;
      }
      public String getemployeeName(){return employeeName;}

      public void setdepartment( String department){
          this.department = department;
      }
       public String getdepartment(){ return department;}

       public void setbasesalary( double basesalary){
            this.basesalary = basesalary;
       }
       public double getbasesalary(){ return basesalary;}
}

public  class Employee_tester{
     public static void main(String[] args) {
          Employee_work f1= new Employee_work();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter baseic salary ");
          f1.setbasesalary(sc.nextDouble());

          System.out.println("Enter department name");
          sc.nextLine();
          f1.setdepartment(sc.nextLine());
          System.out.println("Enter employee name");
          f1.setemployeeName(sc.nextLine());
          System.out.println(" Enter perfomance 1 to 10 "); 
          f1.setperformance(sc.nextInt());

          System.out.println("You got a bonus of :=" +f1.calculateBonus(f1.getperformance()));
          System.out.println("Tha department name :"+f1.getdepartment());
          System.out.println("Employee name is :"+f1.getemployeeName());
          System.out.println("Basic salary is "+f1.getbasesalary());

     }
}