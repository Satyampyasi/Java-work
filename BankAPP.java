import java.util.Scanner;

public class BankAPP {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            System.out.println("Enter intial balance");
            double  intitial_bal = sc.nextDouble();
            System.out.println("Enter deposite balance");
            double  deposite_amt = sc.nextDouble();
           
             double total = intitial_bal+deposite_amt;
             System.out.println("Total amout is "+total);
          
      }
}
