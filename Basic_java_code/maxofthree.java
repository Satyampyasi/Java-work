import java.util.Scanner;

class numberutil{
     public static int findmax( int a , int b , int c){
          if( a>b){
               if(a>c) return a;
               else return c;
          }
          else{
               if(b>c)  return b;
               else  return c;
          }
     }
}

public class maxofthree{
     public static void main(String[] args){
          numberutil f1 = new numberutil();
          Scanner sc= new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
         System.out.println("big is "+numberutil.findmax(a, b, c));
          

     }

}