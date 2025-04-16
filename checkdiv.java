import java.util.Scanner;

public class checkdiv {
     static void checkDivisibility(int num){
if(num%5==0 && num%11 ==0) System.out.println(num+" is divible by both 5 and 11");
else System.out.println(num+"is not divisible by both 5 and 11");
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          checkDivisibility(num);
     }
}
