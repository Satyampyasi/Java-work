public class BillingSystem {
     static double price;
     public static double getGST(){
          return 18.0;
     }
 public static void  claculate(){
     double gst = getGST()
     price = price +(gst/100.0)*price;
     System.out.println("total price "+price);
 }
 public static void main(String[] args) {
     claculate();
 }

}
