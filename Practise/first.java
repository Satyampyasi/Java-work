package Practise;

public class first {
     
     public static int  sum(int x ,int y ){
          return  x+y;  }
     public static void add(int b){

           b++;
          System.out.println("value of b in add"+b);
     }
          public static void main(String[] args) {
             
      int b = 5;
      add(b);
      System.out.println("value of b in add"+b);

      System.out.println("sum of two digit is "+  sum(5,6));
          }
}
