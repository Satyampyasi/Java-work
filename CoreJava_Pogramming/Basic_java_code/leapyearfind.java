import java.util.Scanner;

public class leapyearfind {
     static void checkleap(int year){
        if(year%400==0) System.out.println("Leap year");
        else if (year%100==0) System.out.println("Not a leap year");
        else if( year%4==0) System.out.println("Leap year");
        else System.out.println(" Not a leap year");
     }
     public static void main(String[] args) {
          Scanner  sc = new Scanner(System.in);
          System.out.println(" Enter year");
          int year = sc.nextInt();
          checkleap(year);
     }
}
