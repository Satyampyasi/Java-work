import java.util.Scanner;

public class Flipkart_shop {
     static int  totalOrders=0;
      int orderId;
      String productname;
      double pricename;
      int quantity;
      boolean status;

      void  placeorder(){
          System.out.println("Enter order id :");
         Scanner sc = new Scanner(System.in);
         orderId = sc.nextInt();

         System.out.println("Enter product name :");
         productname = sc.nextLine();

         System.out.println(" do you want to cancel   true false :");
         status=sc.boolean();

         System.out.println("Enter quantity of product :");
         quantity = sc.nextInt();

         totalcost( orderId,productname,status,quantity);
      }

     void cancelorder(){
        return  boolean status = false;
     }    

      void totalcost( int orderId , String productname, boolean status, int quantity){
             totalOrders+=1;
             

     }
     
     public static void main(String[] args) {
          Flipkart_shop f1 = new Flipkart_shop();
          f1.placeorder(); 
     }
     
}

  
