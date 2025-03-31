import java.util.Scanner;

public class TriangleType {
    static  String determineType(int one ,int two,int three){
         if( one == two && one  == three) return " Equilateral triangle";
         else if( one == two||one ==three) return "isosceles triangle";
         else return  "Scalene  triangle";
          
         
     }
      public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int side1 =sc.nextInt();
          int side2 = sc.nextInt();
          int side3 = sc.nextInt();
       System.out.println(determineType(side1,side2,side3));   

      }
}
