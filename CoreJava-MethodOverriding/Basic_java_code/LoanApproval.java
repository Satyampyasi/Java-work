import java.util.Scanner;

public class LoanApproval {
     int salary;
     boolean pendinhLoan;
     static boolean isEligible( int salary,boolean pendinhLoan){
          return salary>=50000 && !pendinhloan;
     }
     public static void main(String[] args) {
          LoanApproval f1 = new LoanApproval();
            f1.salary = 50000;
            f1.pendinhLoan = false;
           if(isEligible(f1.salary,f1.pendinhLoan)){
            System.out.println("Loan Approved");
           }
           else System.out.println("Loan denied");
     }
}
