import java.util.Scanner;

public class GCD {
     static int findGCD(int num1,int num2){
          int flag =0;
          int big  = num1>num2?num1:num2;
         for(int i = 1; i<big;i++){
               if( num2%i==0 && num1%i==0){
                     flag = i;
               }
         }
         return flag;
         
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first  number ");
         int num1 = sc.nextInt();
         System.out.println("Enter secound number");
         int num2 = sc.nextInt();
         System.out.println(findGCD(num1, num2));

     }
}
