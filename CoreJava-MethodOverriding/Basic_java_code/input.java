import java.util.Scanner;
public class input {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your age");
          int age = sc.nextInt();
          System.out.println("your age is="+age);
          System.out.println("Enter tha 1st no");
          int firstnumber = sc.nextInt();
          System.out.println("Enter tha 2st no");
          int secoundnumber = sc.nextInt();
          int result = firstnumber+ secoundnumber;
           System.out.println("sum of two numbwe ="+result);
           sc.close();
     }
}
