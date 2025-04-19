import java.util.Scanner;

public class productSum {
     void process(int a, int b){
       System.out.println(a>b?"product is "+(a*b):"sum is :"+(a+b));
     }
     public static void main(String[] args) {
          productSum f1 = new productSum();
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
            f1.process(a,b);

     }
}
