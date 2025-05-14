import java.util.Scanner;

public class evenCheck {
     static void checkevenodd(int num){
       if( num%2==0) System.out.println(num+" is even");
       else System.out.println(num+" is odd");
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
           checkevenodd(num);
     }
}
