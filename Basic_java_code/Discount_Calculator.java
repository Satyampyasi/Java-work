public class Discount_Calculator {
      static double getdiscount( double totalbill){
          if(totalbill>=500){
              System.out.println(" Congrates you got discount");
              totalbill = totalbill-(totalbill/10);
              return totalbill;
          
          }
          else return totalbill;
      }
      public static void main(String[] args) {
          double totalbill =550;
          System.out.println(" Tha total bill is "+getdiscount(totalbill));
      }
}
