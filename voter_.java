import java.util.Scanner;

class isvoter{

     public  static void isEligible(int age){

    if( age >=18) System.out.println("Eligible");
    else System.out.println("Not eligible");

     }
}


public class voter_ {
     public static void main(String[] args) {
          isvoter  f1 = new isvoter();
          Scanner sc = new Scanner(System.in);
          int age = sc.nextInt();
             isvoter.isEligible(age);
     }
     
}
