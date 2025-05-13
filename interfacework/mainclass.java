/*Scenario:
An e-commerce platform supports multiple payment methods (Credit Card, PayPal, UPI).
The payment system must be flexible and allow adding more methods in the future
without changing the core logic.

Requirements:

- Define a Payment interface with a method processPayment(double amount).
- Implement this interface in three classes: CreditCardPayment, PayPalPayment,
   and UPIPayment.
- Create a CheckoutService class that accepts any Payment implementation to
  perform the transaction.

Test Case:
- Use each implementation to pay an amount of 5000 and show the output. */
interface payment{
    public void  processPayment(double amount);
}

class CreditCardPayment implements  payment{
  @Override
  public void processPayment(double amount) {
    System.out.println("Processing credit card payment of: " + amount);
  }
}

class PayPalPayment implements payment{
  @Override
  public void processPayment(double amount) {
    System.out.println("Processing PayPal payment of: " + amount);
  }
}
class UPIPayment implements payment{
  @Override
  public void processPayment(double amount) {
    System.out.println("Processing UPI payment of: " + amount);
  }
}
class  CheckoutService{
  private payment paymentmethod;
   CheckoutService(payment paymentmethod){
        this.paymentmethod=paymentmethod;
   }
   public void processPaymentmethod(double amount){
       paymentmethod.processPayment(amount);
   }
}
  
public class mainclass {
     public static void main(String[] args) {
      int a =2;
      switch(a){
      case 1: CreditCardPayment c2 = new CreditCardPayment();
      CheckoutService c1 = new CheckoutService(c2);
      c1.processPaymentmethod(500);
        break;
       case 2:
      PayPalPayment p1 = new  PayPalPayment();
      CheckoutService c3 = new CheckoutService(p1);
      c3.processPaymentmethod(200);
      break;

      }
    
     }
}
