
import java.util.Scanner;

class discountCalculator{
     double price ;
     double percentage;
     int couponCode ;
public void calculateDiscount(double price, double percentage){
      System.out.println("You got discount of:" +price*(percentage/100) "\nFinal price is:" +(price-(price*(percentage/100))));
}
public void calculateDiscount(double price, double percentage, boolean isMember){
     if(isMember){
     System.out.println("Member got discount of :" +(price*(percentage/100)+(price*0.05))+"\nFinal");
     }
    else System.out.println("You got discount of:" +price*(percentage/100));
}
public void calculateDiscount(double price, int couponCode){
System.out.println("You got discount of:" +(price-couponCode));
}
}

public class calculate{
     public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          discountCalculator f1 = new discountCalculator();
          System.out.println("Enter 1 if you are member \nEnter 2 if you have coupon code \nother wise 3");
          int choice = sc.nextInt();
          if(choice==1){
             System.out.println("Enter price of product");
             double price = sc.nextDouble();
             System.out.println("Enter discount % :");
             double discount = sc.nextDouble();
             System.out.println("Enter you are menbership is true or false");
             boolean mem = sc.nextBoolean();
             f1.calculateDiscount(price,discount,mem);
          }
         else if(choice==2){
               System.out.println("Enter price of product");
               double price = sc.nextDouble();

               System.out.println("Enter your coupon code no:");
               int code = sc.nextInt();
               f1.calculateDiscount(price,code);
            }
            else if(choice==3)
            {
               System.out.println("Enter price of product");
               double price = sc.nextDouble();

               System.out.println("Enter discount % :");
               double discount = sc.nextDouble();
               f1.calculateDiscount(price,discount);
            }
            else System.out.println(" invalid choice");
     }
}
