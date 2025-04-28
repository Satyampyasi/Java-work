package src;

class task{

     public int  multiply(int a, int b){
          return a+b;
     }
     public int multiply(int a ,int b , int c){
          return a+b+c;
     }
     public double multiply( double a , double b){
     return a+b;
     }
     public double multiply(double a , double b, double c){
     return a+b+c;
     }
}

public class Calculate {
          public static void main(String[] args){
          task t1 = new task();
          int a =5,b=10,c=5;
          double A=5.5,B=10.5,C=5.5;

         System.out.println( t1.multiply(a,b));  
         System.out.println( t1.multiply(A,B));
         System.out.println( t1.multiply(A,B,C));
         System.out.println( t1.multiply(a,b,c));
         
       
     }
}
