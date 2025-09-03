import java.util.Scanner;

class calculatework{
     public void calculate( int a , int b){
   if( a>b) System.out.println("result "+(a-b));
   else if(a==b) System.out.println("result "+(a*b));
   else System.out.println("result "+(a+b));
     }

     public static void main(String[] args) {
          calculator f1 = new calculator();
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          f1.calculate(a, b);
     }
}


