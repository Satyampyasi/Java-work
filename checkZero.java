import java.util.Scanner;

public class checkZero {
     static void checkZero(int num){
   if(num==0) System.out.println("num is zero");
   else System.out.println("num is not zero");
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          checkZero(num);
     }
}
