import java.util.Scanner;

public class findSmal {
     static void findSmallest(int a, int b, int c){
      if(a<b && a<c) System.out.println(a+" is small");
      else if(b<a && b<c) System.out.println(b+" is small");
      else if(c<a && c<b ) System.out.println(c+" is small");
      else System.out.println(" all equal");
 
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a =  sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          findSmallest(a, b, c);
     }
}
