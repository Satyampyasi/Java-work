import java.util.Scanner;

public class Gradefind {
     static void printGrade(double marks){
       if( marks >90) System.out.println("Grade A");
       else if( marks>=75 && marks<=89) System.out.println("Grade B");
       else if( marks>=50 && marks<=74) System.out.println("Grade C");
       else System.out.println("Fail");
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double marks = sc.nextDouble();
          printGrade(marks);
     }
}
