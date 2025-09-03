import java.util.Scanner;

public class Factorial {
         static int takefactorial(int num){
          int result = 1;
            for(int i = 1;i<=num;i++){
               result = result*i;
            }
            return result;
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          System.out.println(takefactorial(num));   
     }
}
