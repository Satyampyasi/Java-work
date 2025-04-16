import java.util.Scanner;

public class checkrange {
     static void checkRange(int num){
     if(num >=1 && num<=100) System.out.println("num in range");
     else System.out.println("num not in range");
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          checkRange(num);
     }
}
