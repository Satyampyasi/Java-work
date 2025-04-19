import java.util.Scanner;

public class tempcheck {
     public void checkTemprature(int temp){
     if(temp<0) System.out.println("Freezing");
     else if( temp>=0 && temp<=20) System.out.println("Cold");
     else if( temp>=21 && temp<=35) System.out.println("Normal");
     else System.out.println("Hot");

     }
     public static void main(String[] args){
          tempcheck f1 = new tempcheck();
          Scanner sc = new Scanner(System.in);
          System.err.println("Enter temprature:");
          int temp = sc.nextInt();
          f1.checkTemprature(temp);
     }
}
