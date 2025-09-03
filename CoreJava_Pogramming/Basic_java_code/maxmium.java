import java.util.Scanner;

public class maxmium {

      static int ismax(int num1,int num2,int num3){
           return num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
      }
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          int num3 = sc.nextInt();

        System.out.println("This is a biggest = "+ismax(num1,num2,num3));   
      }
}