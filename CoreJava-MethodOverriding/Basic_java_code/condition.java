import java.util.Scanner;

public class condition {
     public static void main(String[] args) {
          Scanner check = new Scanner(System.in);
          System.out.println("Enter a day ");
          int day = check.nextInt();

          if (day==1) {
               System.out.println("you can party ");
          }
          else if (day==2) {
                    System.out.println("you have to office ");
          }
          else if (day==3) {
               System.out.println("you are on hollyday");
     }
     else {
          System.out.println("You are out of range");
     }
      
          
     }
}
